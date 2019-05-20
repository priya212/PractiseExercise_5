/*
 * Created By-Priyanka
 * Date-18/5/2019
 * This program is used to sort the elements from set and again store that value in array list.
 */
package PE5;

import java.util.Set;
import java.util.*;

public class SortSet {
    /* Sorts the given input and store in set */
    public Set<String> sortSet(String[] input) {
        Set<String> output=new TreeSet<>();
        for(int i=0;i<input.length;i++) {
            output.add(input[i]);
        }
        return output;
    }
    /* Store the sorted set in array list */
    public List<String> convertToArrayList(Set<String> input) {
      List<String> output=new ArrayList<>();
      output.addAll(input);
        return output;
    }
}
