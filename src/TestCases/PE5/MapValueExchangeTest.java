/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to test that the set the value of val1 key to another  val2 key.
 * And then update that value of first key to empty string.
 */
package PE5;

import org.junit.*;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class MapValueExchangeTest {
    private static  MapValueExchange exchange;
    @BeforeClass
    public static void setup()
    {
        exchange=new MapValueExchange();
    }

    @AfterClass
    public static void  teardown()
    {
        exchange=null;
    }
    /* set the value of val1 key to another val2 key and update value of val1 to empty */
    @Test
    public void valueExchange_GivenInputIsMapKeyAndValue_SetTheValueOfVal1KeyToAnotherVal2KeyAndUpdateValueOfVal1ToEmpty() {
        Map<String,String> Map1=new HashMap<>();
        Map1.put("val1","java");
        Map1.put("val2","c++");
        Map<String,String> expectedOutput=new HashMap<>();
        expectedOutput.put("val1"," ");
        expectedOutput.put("val2","java");

        assertEquals(expectedOutput,exchange.valueExchange(Map1));
    }
    /* Failure for set the value of val1 key to another val2 key */
    @Test
    public void valueExchange_GivenInputIsMapKeyAndValue_SetTheValueOfVal1KeyToAnotherVal2KeyAndUpdateValueOfVal1ToEmptyFailure() {
        Map<String,String> Map1=new HashMap<>();
        Map1.put("val1","java");
        Map1.put("val2","c++");
        Map<String,String> expectedOutput=new HashMap<>();
        expectedOutput.put("val1","java ");
        expectedOutput.put("val2","c++");

        assertNotEquals(expectedOutput,exchange.valueExchange(Map1));
    }
    /* If given key not found then return null */
    @Test
    public void valueExchange_GivenInputIsMapKeyAndValue_IfGivenKeyNotFoundReturnNull() {
        Map<String,String> Map1=new HashMap<>();
        Map1.put("val3","java");
        Map1.put("val2","c++");
        assertEquals(null,exchange.valueExchange(Map1));
    }
}