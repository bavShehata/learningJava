
package Part4Example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kareem", 13789,"1111"));
        students.add(new Student("Nada", 15897,"2222"));

        FileOutputStream fos = new FileOutputStream("Students2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("Students2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        ois.close();
        fis.close();


    }
    
 
}
