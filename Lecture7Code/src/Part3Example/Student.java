
package Part3Example;

import java.io.Serializable;


public class Student implements Serializable{
    String name;
    int id;
    static int count =0 ;
    transient String password;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        count++;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", password=" + password + " count =" + count+'}';
    }

}
