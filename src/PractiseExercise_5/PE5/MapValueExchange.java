/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to set the value of val1 key to another val2 key.
 * And then update that value of first key to empty string.
 */
package PE5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapValueExchange {
    public Map<String,String> valueExchange(Map<String,String> Map1){
        Map<String,String> output=new HashMap<>();
        String[] key=new String[2];
        String[] value=new String[2];
        int i=0;
        Iterator<Map.Entry<String,String>> iter=Map1.entrySet().iterator();
        /* Stores the each key and value to another array */
        while (iter.hasNext()) {
            Map.Entry<String,String> mapEntry=iter.next();
            key[i]=mapEntry.getKey();
            value[i]=mapEntry.getValue();
            i++;
        }
        String temp="";
        int flag=0;
        /* Store the value of first key to temporary variable then update that key to empty value */
        for(int j=0;j<key.length;j++) {
            if (key[j].equals("val1")) {
                temp = value[j];
                value[j] = " ";
                flag=1;
                break;
            }
        }
        if(flag==0) {
            return null;
        }
        /* Sets the value of first key to second key */
        for(int j=0;j<key.length;j++) {
            if(key[j].equals("val2")) {
                value[j]=temp;
                break;
            }
        }
        /* Stores the output key and value to Map */
        for(int k=0;k<key.length;k++) {
            output.put(key[k],value[k]);
        }
        return  output;
    }
}
