/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program to find the number of counts in the given String.
 */
package PE5;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    /* Finds the how many times the given string occure */
    public int countValue(String input,String name){
        Pattern pattern=Pattern.compile(name);
        Matcher matcher=pattern.matcher(input);
        int count=0;
        while(matcher.find()) {
            count++;
        }
        return count;
    }
    public Map<String,Integer> numberOfCount(String input) {
        if (input == " ") {
            return null;
        } else {
            Map<String, Integer> output = new HashMap<>();
            String value1 = "one";
            String value2 = "two";
            String value3 = "three";
            int count1 = countValue(input, value1);
            int count2 = countValue(input, value2);
            int count3 = countValue(input, value3);
            output.put(value1, count1);
            output.put(value2, count2);
            output.put(value3, count3);
            return output;
        }
    }
}
