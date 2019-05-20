/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to test out how many times the given string occur.
 * If occur 2 or more time then return true.
 * If occur less than 2 times return false.
 */
package PE5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class CountArrayOfStringsTest {
    private static CountArrayOfStrings countString;
    @BeforeClass
    public static void setup() {
        countString=new CountArrayOfStrings();
    }
    @AfterClass
    public static void teardown() {
        countString=null;
    }
    /* Count how many times given string occur and if occur 2 or more times return true else false */
    @Test
    public void countString_GivenArrayOfStrings_IfOccurTwoOrMoreTimesReturnTrueElseFalse() {
        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);
        assertEquals(output,countString.countString(input));
    }
    /* Failure for count how many times given string occur and if occur 2 or more times return true else false */
    @Test
    public void countString_GivenArrayOfStrings_IfOccurTwoOrMoreTimesReturnTrueElseFalseFailure() {
        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",true);
        output.put("c",true);
        output.put("d",false);
        assertNotEquals(output,countString.countString(input));
    }
    /* If input contains null value then continue the process and return output */
    @Test
    public void countString_GivenArrayOfStrings__IfInputContainsNullThenContinueTheProcessAndReturnOutput() {
        String[] input={"a","b","c","d","a","c","c",null};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);
        assertEquals(output,countString.countString(input));
    }
    /* Failure for if input contains null value then continue the process and return output */
    @Test
    public void ifInputIsNUllReturnNull() {
        assertEquals(null,countString.countString(null));
    }
}