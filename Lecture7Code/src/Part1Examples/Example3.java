package Part1Examples;

import java.io.*;
import java.util.ArrayList;

public class Example3 {

    public static void main(String[] args) throws Exception {
        
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("T-shirt", 250.0, 7));
        products.add(new Product("Mug", 65.0, 10));
        products.add(new Product("short", 300.50, 8));


        FileOutputStream fos = new FileOutputStream("Products3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("Products3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        products = (ArrayList<Product>)ois.readObject();
        System.out.println(products);
        ois.close();
        fis.close();


    }
}