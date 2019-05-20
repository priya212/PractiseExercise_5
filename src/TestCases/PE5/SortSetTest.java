/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to test, sort the elements from set and again store that value in array list.
 */
package PE5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SortSetTest {
    private static SortSet sortset;
    @BeforeClass
    public static void setup() {
        sortset=new SortSet();
    }
    @AfterClass
    public static  void teardown() {
        sortset=null;
    }
    /* Sort the elements from array of string and then store in set and then store the set in array list */
    @Test
    public void convertToArrayList_GivenInputIsStringArray_SortSetAlphabetically() {
        String[] input={"Harry","Olive","Alice","Bluto","Eugene"};
        Set<String> expected=new TreeSet<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertEquals(expected,sortset.sortSet(input));

        List<String> expectedOutput=new ArrayList<>();
        expectedOutput.addAll(expected);
        assertEquals(expectedOutput,sortset.convertToArrayList(expected));
    }
    /* Failure for sort the elements from array of string and then store in set and then store the set in array list */
    @Test
    public void convertToArrayList_GivenInputIsStringArray_SortSetAlphabeticallyFailure() {
        String[] input={"Harry","Olive","Alice","Bluto","Eugene"};
        Set<String> expected=new HashSet<>();
        expected.add("Alice");
        expected.add("Alice");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        assertNotEquals(expected,sortset.sortSet(input));

        List<String> expectedOutput=new ArrayList<>();
        expectedOutput.addAll(expected);
        assertEquals(expectedOutput,sortset.convertToArrayList(expected));
    }
}