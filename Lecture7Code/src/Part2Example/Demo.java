
package Part2Example;

import Part1Examples.Product;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        fav_Course c = new fav_Course("Programming in Java","20CSCI04C");
        students.add(new Student("Kareem", 13789, c));
        students.add(new Student("Nada", 15897 , c));

        FileOutputStream fos = new FileOutputStream("Students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("Students.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        students = (ArrayList<Student>)ois.readObject();
        System.out.println(students);
        ois.close();
        fis.close();


    }
    
 
}
