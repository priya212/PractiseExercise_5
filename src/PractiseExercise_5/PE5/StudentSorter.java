/*
 *Created By-Priyanka
 * date-18/5/2019
 * This program is used to sort the given array according to their age.
 * If age of two students same then sort according to their name.
 * If both name and age are same then sort according to their ID.
 */
package PE5;

import java.util.Comparator;

class StudentSorter implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2) {
        Student s1= (Student) obj1;
        Student s2= (Student) obj2;
        /* Sort the given input according to their age */
        if(s1.getAge()>s2.getAge()) {
            return -1;
        }
        /* If age of two student are same then sort according to their name */
        else if(s1.getAge()==s2.getAge()) {
            if(s1.getName().compareTo(s2.getName())==-1) {
                return 1;
            }
            /* If name and age of two students are same then sort according to their ID */
            else if(s1.getName().compareTo(s2.getName())==0) {
                if(s1.getId()>s2.getId()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            return  1;
        }
        else {
            return 1;
        }
    }
}
