/*
 *Created By-Priyanka
 * date-18/5/2019
 * This program is used to sort the given array according to their age.
 * If age of two students same then sort according to their name.
 * If both name and age are same then sort according to their ID.
 */
package PE5;

import java.util.*;

public class MainTest {
    public List<Student> listSorting(List<Student> studentList1) {
        StudentSorter StudSort=new StudentSorter();
        /* Sort the given list*/
        Collections.sort(studentList1,StudSort);
        return studentList1;
    }
}

