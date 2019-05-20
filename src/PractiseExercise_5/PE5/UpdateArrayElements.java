/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to update specific array element by given element and empty the array list.
 */
package PE5;

import java.util.List;

public class UpdateArrayElements {
    public List<String> updateElement(List<String> input) {
        /* set() is used to update the specific array element */
        input.set(0,"Kiwi");
        input.set(2,"Mango");
        return input;
    }
    public List<String> clearList(List<String> input) {
        /* clear() is used to clear or empty the array list */
        input.clear();
        return input;
    }
}
