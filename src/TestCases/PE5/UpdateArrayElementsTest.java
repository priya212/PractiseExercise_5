/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to test update specific array element by given element or not and empty the array list or not.
 */
package PE5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import  java.util.List;
import static org.junit.Assert.*;

public class UpdateArrayElementsTest {
    private static UpdateArrayElements update;
    @BeforeClass
    public static void setup()
    {
        update=new UpdateArrayElements();
    }
    @AfterClass
    public  static void teardown()
    {
        update=null;
    }
    /* Update the first and third element of array */
    @Test
    public void updateElement_GivenInputIsListOfsString_UpdateArrayElements(){
        List<String> input=new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        List<String> expectedOutput=new ArrayList<>();
        expectedOutput.add("Kiwi");
        expectedOutput.add("Grape");
        expectedOutput.add("Mango");
        expectedOutput.add("Berry");
        List<String> finalOutput=update.updateElement(input);
        assertEquals(expectedOutput,finalOutput);

        List<String> expectedOutput1=new ArrayList<>();
        List<String> finalOutput1=update.clearList(finalOutput);
        assertEquals(expectedOutput1,finalOutput1);
    }
    /* Failure for Update the first and third element of array*/
    @Test
    public void updateElement_GivenInputIsListOfsString_UpdateArrayElementsFailure(){
        List<String> input=new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        List<String> expectedOutput=new ArrayList<>();
        expectedOutput.add("Kiwi");
        expectedOutput.add("Grape");
        expectedOutput.add("mango");
        expectedOutput.add("Berry");
        List<String> finalOutput=update.updateElement(input);
        assertNotEquals(expectedOutput,finalOutput);
    }
}