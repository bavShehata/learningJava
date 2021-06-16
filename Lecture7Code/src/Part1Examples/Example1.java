/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Examples;

import java.io.*;
import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) throws Exception {
        ArrayList<Product> arr = new ArrayList<> ();
        arr.add(new Product ("T-shirt",250.0,7));
        arr.add(new Product ("Mug",65.0,10));
        arr.add(new Product ("short",300.50,8));
        FileOutputStream s = new FileOutputStream("Products_a.txt"); //"("//C:/Products_a.txt")
        DataOutputStream out = new DataOutputStream(s);

        for (Product p:arr) {            
            out.writeUTF(p.getDescription());
            out.writeDouble(p.getPrice());
            out.writeInt(p.getUnits());
              }
        
        s.close();
        out.close();

        FileInputStream s2 = new FileInputStream("Products_a.txt");
        DataInputStream in = new DataInputStream(s2);
        try {
            while (true) {                          
                String desc = in.readUTF();
                double price = in.readDouble();
                int unit = in.readInt();
                System.out.println(desc + " " +  price + " " + unit);
                }          

        } catch (EOFException e) {
        }
      s2.close();
      in.close();
    }
    
    
}