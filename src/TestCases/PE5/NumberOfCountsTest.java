/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program to test the number of counts in the given String.
 */
package PE5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NumberOfCountsTest {
    private static NumberOfCounts nCount;
    @BeforeClass
    public static void setup() {
        nCount = new NumberOfCounts();
    }
    @AfterClass
    public static  void teardown() {
        nCount=null;
    }
    /* Count the given string how many times occur in string and returns count */
    @Test
    public void numberOfCount_GivenInputIsString_givesNumberOfCountsItWillOccur() {
        String input = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        Map<String, Integer> finalResult = nCount.numberOfCount(input);
        assertEquals(expected, finalResult);
    }
    /* Failure for count the given string how many times occur in string and returns count */
    @Test
    public void numberOfCount_GivenInputIsString_givesNumberOfCountsItWillOccurFailure() {
        String input = "one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        expected.put("two", 3);
        expected.put("three", 2);
        Map<String, Integer> finalResult = nCount.numberOfCount(input);
        assertNotEquals(expected, finalResult);
    }
    /* If input is empty string then return null*/
    @Test
    public void numberOfCount_GivenInputIsEmptyString_IfInputIsEmptyStringReturnNull() {
        String input = " ";
        assertEquals(null,nCount.numberOfCount(input));
    }
    /* Failure for if input is empty string then return null*/
    @Test
    public void numberOfCount_GivenInputIsEmptyString_IfInputIsEmptyStringReturnNullFailure() {
        String input = " ";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("one", 5);
        assertNotEquals(expected,nCount.numberOfCount(input));
    }
}