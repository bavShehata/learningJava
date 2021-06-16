
package Part2Example;

import java.io.Serializable;


public class Student implements Serializable{
    String name;
    int id;
    fav_Course c;

    public Student(String name, int id, fav_Course c) {
        this.name = name;
        this.id = id;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", c=" + c + '}';
    }
    
    
    
}
