
package Part5Example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(8965,300));
        cars.add(new Car(8995, 200));

        FileOutputStream fos = new FileOutputStream("vehicles.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cars);
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("vehicles.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        cars = (ArrayList<Car>) ois.readObject();
        System.out.println(cars);
        ois.close();
        fis.close();


    }
    
 
}
