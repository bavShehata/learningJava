package monorail;

import java.util.ArrayList; // import the ArrayList class
import java.io.*;

public class Monorail {

    // A function that writes an arraylist of objects to a file
    public static void writeArrayList(String o, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(o + ".txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("File doesn't exist: " + o + ".txt");
        }
    }

    // A function that reads an arraylist of objects to a file
    public static Object readArrayList(String o) {
        try {
            FileInputStream fis = new FileInputStream(o + ".txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object arrayList = ois.readObject();
            ois.close();
            fis.close();
            return arrayList;
        } catch (IOException e) {
            System.out.println("File doesn't exist: " + o + ".txt");

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + o);

        }
        return new Object();

    }

    public static ArrayList<Route> routes = new ArrayList<Route>();
    public static ArrayList<Ticket> tickets = new ArrayList<>();
    public static ArrayList<Passenger> passengers = new ArrayList<>();
    public static void main(String[] args) {
        tickets.add(new Ticket(0));        tickets.add(new Ticket(1));
        tickets.add(new Ticket(2));

        System.out.println("Here are current tickets: ");
        for (Ticket t : tickets) {
            System.out.println(t.display());
        }
        writeArrayList("Ticket", tickets);
        System.out.println("Data written successfully");
        tickets.clear();
        System.out.println("ArrayList Cleared successfully\nHere are current tickets: ");
        for (Ticket t : tickets) {
            System.out.println(t.display());
        }
        tickets = (ArrayList<Ticket>) readArrayList("Ticket");
        System.out.println("Data read successfully");
        System.out.println("Here are current tickets: ");
        for (Ticket t : tickets) {
            System.out.println(t.display());
        }
        PassengerMethodsUI PMUI = new PassengerMethodsUI();
        PMUI.setVisible(true);
    }
}
