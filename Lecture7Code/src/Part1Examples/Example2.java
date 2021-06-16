package Part1Examples;

import java.io.*;
import java.util.ArrayList;

public class Example2 {

    public static void main(String[] args) throws Exception {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("T-shirt", 250.0, 7));
        products.add(new Product("Mug", 65.0, 10));
        products.add(new Product("short", 300.50, 8));


        FileOutputStream fos = new FileOutputStream("Products_b.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /* for (int i=0; i<products.size();i++)
         {
         Product p  = products.get(i);
         oos.writeObject(p);
        
         }*/

        for (Product p : products) {
            oos.writeObject(p);        
        }

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("Products_b.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Product p = (Product) ois.readObject();
                System.out.println(p);
            }
        } catch (EOFException ex) {
        }

        ois.close();
        fis.close();


    }
}