/*
 *Created By-Priyanka
 * date-18/5/2019
 * This program is used to sort the given array according to their age.
 * If age of two students same then sort according to their name.
 * If both name and age are same then sort according to their ID.
 */
package PE5;

public class Student {
    private  int id;
    private  String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}


