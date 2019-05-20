/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to find out how many times the given string occur.
 * If occur 2 or more time then return true.
 * If occur less than 2 times return false.
 */
package PE5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountArrayOfStrings {
    /* Counts the how many times given string occur */
    public boolean countValue(String temp,String mapKey){
        Pattern pattern=Pattern.compile(mapKey);
        Matcher matcher=pattern.matcher(temp);
        boolean flag=false;
        int count=0;
        /* Matches the given string with input string */
        while(matcher.find()) {
            count++;
        }
        if(count>=2) {
            flag=true;
            return flag;
        }
        else
            return flag;
    }
    public Map<String,Boolean> countString(String[] input) {
        if(input==null) {
            return null;
        }
        Map<String,Boolean> output=new HashMap<>();
        /* Initially set value of string to false */
        for(int i=0;i<input.length;i++) {
            if(input[i]==null) {
                continue;
            }
            else {
                output.put(input[i], false);
            }
        }
        String temp="";
        for(int i=0;i<input.length;i++) {
            temp+=input[i]+" ";
        }
        /* Calculate the value of string how many times occure then update the value of count */
        Iterator<Map.Entry<String,Boolean>> iter=output.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String,Boolean> mapEntry=iter.next();
            String mapKey=mapEntry.getKey();
            boolean value=countValue(temp,mapKey);
            output.put(mapKey,value);
        }
        return output;
    }
}
