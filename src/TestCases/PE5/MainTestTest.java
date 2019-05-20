/*
 *Created By-Priyanka
 * date-18/5/2019
 * This program is used to test out sort the given array according to their age.
 * If age of two students same then sort according to their name.
 * If both name and age are same then sort according to their ID.
 *
 */
package PE5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MainTestTest {
    private static MainTest main;
    @BeforeClass
    public static void setup() {
        main=new MainTest();
    }
    @AfterClass
    public static void teardown() {
        main=null;
    }
    /* sort the given list according to given condition */
    @Test
    public void listSorting_GivenInputIsListOfStudents_SortAccordingToGivenCondition() {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("nita");
        s1.setAge(20);

        Student s2=new Student();
        s2.setId(7);
        s2.setName("kajal");
        s2.setAge(20);

        Student s3=new Student();
        s3.setId(5);
        s3.setName("sarika");
        s3.setAge(22);

        Student s4=new Student();
        s4.setId(9);
        s4.setName("sarika");
        s4.setAge(22);

        Student s5=new Student();
        s5.setId(3);
        s5.setName("deepa");
        s5.setAge(22);

        List<Student> studentList1=new ArrayList<Student>();
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        List<Student> expectedOutput=new ArrayList<>();
        expectedOutput.add(s4);
        expectedOutput.add(s3);
        expectedOutput.add(s5);
        expectedOutput.add(s1);
        expectedOutput.add(s2);

        assertEquals(expectedOutput,main.listSorting(studentList1));
    }
    /* Failure for sort the given list according to given condition */
    @Test
    public void listSorting_GivenInputIsListOfStudents_SortAccordingToGivenConditionFailure() {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("nita");
        s1.setAge(20);

        Student s2=new Student();
        s2.setId(7);
        s2.setName("kajal");
        s2.setAge(20);

        Student s3=new Student();
        s3.setId(5);
        s3.setName("sarika");
        s3.setAge(22);

        Student s4=new Student();
        s4.setId(9);
        s4.setName("sarika");
        s4.setAge(22);

        Student s5=new Student();
        s5.setId(3);
        s5.setName("deepa");
        s5.setAge(22);

        List<Student> studentList1=new ArrayList<Student>();
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        List<Student> expectedOutput=new ArrayList<>();
        expectedOutput.add(s4);
        expectedOutput.add(s3);
        expectedOutput.add(s1);
        expectedOutput.add(s5);
        expectedOutput.add(s2);

        assertNotEquals(expectedOutput,main.listSorting(studentList1));
    }
}