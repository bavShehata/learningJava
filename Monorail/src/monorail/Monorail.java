package monorail;

import java.util.ArrayList; // import the ArrayList class
import java.io.*;
import java.util.Scanner;

public class Monorail {
    
    
    // ###################### Made by Tasneem and Haya 
    public static void writeIntoAdminFile(String a, Object admin) {
        a = "Admins";
        try {
            FileOutputStream myFile = new FileOutputStream(a + ".txt");
            ObjectOutputStream aos = new ObjectOutputStream(myFile);
            aos.close();
            myFile.close();
        } catch (IOException e) {
            System.out.println("file is not found");
        }
    }

    public static Object readFromAdmins(String read) throws FileNotFoundException {
        try {
            FileInputStream myFile = new FileInputStream("Admins.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String readData = reader.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        return new Object();
    }

    public static void writeIntoRouteFile(String r, Object admin) {
        r = "Routes";
        try {
            FileOutputStream myFile = new FileOutputStream(r + ".txt");
            ObjectOutputStream aos = new ObjectOutputStream(myFile);
            for (Route R : routes) {
                aos.writeUTF(R.getDestination());
                aos.writeUTF(R.getOrigin());
                aos.writeDouble(R.getTicketFare());
                aos.writeObject(R.getStoppingStations());
            }
            aos.close();
            myFile.close();
        } catch (IOException e) {
            System.out.println("file is not found");
        }
    }

    public static Object readFromRoute(String read) throws FileNotFoundException {
        try {
            FileInputStream myFile = new FileInputStream("Routes.txt");
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String readData = reader.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        return new Object();
    }
    // ###################### Made by Aisha and Nadeen
    public static ArrayList<Route> routes = new ArrayList<Route>();
    public static ArrayList<Ticket> tickets = new ArrayList<>();
    public static ArrayList<Passenger> passengers = new ArrayList<>();
    public static ArrayList<Admin> admins = new ArrayList<>();
    public static ArrayList<Train> trains = new ArrayList<>();
    public static ArrayList<Booking> bookings = new ArrayList<>();
    public static ArrayList<String> stoppingStations1 = new ArrayList<String>();
    public static ArrayList<String> stoppingStations2 = new ArrayList<String>();
    public static ArrayList<String> stoppingStations3 = new ArrayList<String>();
    public static ArrayList<String> stoppingStations4 = new ArrayList<String>();
    public static ArrayList<String> stoppingStations5 = new ArrayList<String>();
    public static ArrayList<Ticket> Ticket1= new ArrayList<Ticket>();    public static ArrayList<Ticket> Ticket2= new ArrayList<Ticket>();
    public static ArrayList<Ticket> Ticket3= new ArrayList<Ticket>();
    public static ArrayList<Ticket> Ticket4= new ArrayList<Ticket>();
    public static ArrayList<Ticket> Ticket5= new ArrayList<Ticket>();

    private static void initializeAdmins() {
        Admin a1 = new Admin("Amr", "12345679");
        Admin a2 = new Admin("Ali", "12300679");
        Admin a3 = new Admin("Zara", "55545679");
        Admin a4 = new Admin("Nermeen", "66259214");
        Admin a5 = new Admin("Mohammed", "50254633");
        Admin a6 = new Admin("Nasr", "55824409");
        admins.add(a1);
        admins.add(a2);
        admins.add(a3);
        admins.add(a4);
        admins.add(a5);
        admins.add(a6);

    }

    private static void initializeTrains() {
        Train t1 = new Train(null, null, 100); //first departure time
        Train t2 = new Train(null, null, 100);  //  number of trips in a day
        Train t3 = new Train(null, null, 100);   //  departure time for last train
        Train t4 = new Train(null, null, 100);
        Train t5 = new Train(null, null, 100);

        ArrayList<DepartureTime> Dept1 = new ArrayList<DepartureTime>();
        DepartureTime d1 = new DepartureTime(8, 100, t1);
        DepartureTime d2 = new DepartureTime(10, 100, t2);
        DepartureTime d3 = new DepartureTime(12, 100, t3);
        DepartureTime d4 = new DepartureTime(14, 100, t4);
        DepartureTime d5 = new DepartureTime(16, 100, t5);

        Dept1.add(d1);
        Dept1.add(d2);
        Dept1.add(d3);
        Dept1.add(d4);
        Dept1.add(d5);

        ArrayList<DepartureTime> Dept2 = new ArrayList<DepartureTime>();
        DepartureTime d6 = new DepartureTime(18, 100, t1);
        DepartureTime d7 = new DepartureTime(20, 100, t2);
        DepartureTime d8 = new DepartureTime(22, 100, t3);
        DepartureTime d9 = new DepartureTime(24, 100, t4);
        DepartureTime d10 = new DepartureTime(26, 100, t5);
        Dept2.add(d6);
        Dept2.add(d7);
        Dept2.add(d8);
        Dept2.add(d9);
        Dept2.add(d10);
        ArrayList<DepartureTime> Dept3 = new ArrayList<DepartureTime>();
        DepartureTime d16 = new DepartureTime(28, 100, t1);
        DepartureTime d17 = new DepartureTime(30, 100, t2);
        DepartureTime d18 = new DepartureTime(32, 100, t3);
        DepartureTime d19 = new DepartureTime(34, 100, t4);
        DepartureTime d20 = new DepartureTime(36, 100, t5);

        Dept3.add(d16);
        Dept3.add(d17);
        Dept3.add(d18);
        Dept3.add(d19);
        Dept3.add(d20);

        ArrayList<DepartureTime> Dept4 = new ArrayList<DepartureTime>();
        DepartureTime d21 = new DepartureTime(38, 100, t1);
        DepartureTime d22 = new DepartureTime(40, 100, t2);
        DepartureTime d23 = new DepartureTime(42, 100, t3);
        DepartureTime d24 = new DepartureTime(44, 100, t4);
        DepartureTime d25 = new DepartureTime(46, 100, t5);

        Dept4.add(d21);
        Dept4.add(d22);
        Dept4.add(d23);
        Dept4.add(d24);
        Dept4.add(d25);

        ArrayList<DepartureTime> Dept5 = new ArrayList<DepartureTime>();
        DepartureTime d26 = new DepartureTime(48, 100, t1);
        DepartureTime d27 = new DepartureTime(50, 100, t2);
        DepartureTime d28 = new DepartureTime(52, 100, t3);
        DepartureTime d29 = new DepartureTime(54, 100, t4);
        DepartureTime d30 = new DepartureTime(56, 100, t5);

        Dept5.add(d26);
        Dept5.add(d27);
        Dept5.add(d28);
        Dept5.add(d29);
        Dept5.add(d30);
        t1.setDepartureTimes(Dept1);
        t2.setDepartureTimes(Dept2);
        t3.setDepartureTimes(Dept3);
        t4.setDepartureTimes(Dept4);
        t5.setDepartureTimes(Dept5);

        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        trains.add(t4);
        trains.add(t5);

    }

    private static void initializeStoppingStations() {

        stoppingStations1.add("Attaba");  //origin
        stoppingStations1.add("Free zone");  //stations
        stoppingStations1.add("Middle Ring Road");

        stoppingStations2.add("Sadat");
        stoppingStations2.add("Kit Kat");
        stoppingStations2.add("Opera");

        stoppingStations3.add("American University"); //destination
        stoppingStations3.add("Cairo University");
        stoppingStations3.add("Faisal");

        stoppingStations4.add("Doki");
        stoppingStations4.add("Behoos");
        stoppingStations4.add("Maadi");

        stoppingStations5.add("Airport");
        stoppingStations5.add("Sarayat");
        stoppingStations5.add("Giza");
    }

    private static void initializeRoutes() {
        Route r1 = new Route(stoppingStations1, 7.5, 1000.02, trains.get(0));
        Route r2 = new Route(stoppingStations2, 8.9, 50000.31, trains.get(1));
        Route r3 = new Route(stoppingStations3, 10.0, 4000, trains.get(2));
        Route r4 = new Route(stoppingStations4, 10.5, 3500, trains.get(3));
        Route r5 = new Route(stoppingStations5, 9.75, 4359.99, trains.get(4));

        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        routes.add(r4);
        routes.add(r5);
    }

    private static void initializeTickets() {

        Ticket1 = new ArrayList<Ticket>();
        Ticket T1 = new Ticket(15);
        Ticket T2 = new Ticket(99);
        Ticket T3 = new Ticket(50);
        Ticket T4 = new Ticket(66);
        Ticket T5 = new Ticket(98);

        Ticket1.add(T1);
        Ticket1.add(T2);
        Ticket1.add(T3);
        Ticket1.add(T4);
        Ticket1.add(T5);
         Ticket2 = new ArrayList<Ticket>();
        Ticket T6 = new Ticket(11);
        Ticket T7 = new Ticket(97);
        Ticket T8 = new Ticket(59);
        Ticket T9 = new Ticket(76);
        Ticket T10 = new Ticket(88);

        Ticket2.add(T6);
        Ticket2.add(T7);
        Ticket2.add(T8);
        Ticket2.add(T9);
        Ticket2.add(T10);
         Ticket3 = new ArrayList<Ticket>();
        Ticket T11 = new Ticket(17);
        Ticket T12 = new Ticket(12);
        Ticket T13 = new Ticket(40);
        Ticket T14 = new Ticket(72);
        Ticket T15 = new Ticket(35);

        Ticket3.add(T11);
        Ticket3.add(T12);
        Ticket3.add(T13);
        Ticket3.add(T14);
        Ticket3.add(T15);

         Ticket4 = new ArrayList<Ticket>();
        Ticket T16 = new Ticket(18);
        Ticket T17 = new Ticket(17);
        Ticket T18 = new Ticket(14);
        Ticket T19 = new Ticket(77);
        Ticket T20 = new Ticket(33);

        Ticket4.add(T16);
        Ticket4.add(T17);
        Ticket4.add(T18);
        Ticket4.add(T19);
        Ticket4.add(T20);
         Ticket5 = new ArrayList<Ticket>();
        Ticket T21 = new Ticket(93);
        Ticket T22 = new Ticket(2);
        Ticket T23 = new Ticket(85);
        Ticket T24 = new Ticket(52);
        Ticket T25 = new Ticket(39);

        Ticket5.add(T21);
        Ticket5.add(T22);
        Ticket5.add(T23);
        Ticket5.add(T24);
        Ticket5.add(T25);

    }

    private static void initializeBookings() {
        Booking b1 = new Booking(routes.get(0), trains.get(0).getDepartureTimes().get(0), Ticket1);
        Booking b2 = new Booking(routes.get(1), trains.get(1).getDepartureTimes().get(1), Ticket2);
        Booking b3 = new Booking(routes.get(2), trains.get(2).getDepartureTimes().get(2), Ticket3);
        Booking b4 = new Booking(routes.get(3), trains.get(3).getDepartureTimes().get(3), Ticket3);
        Booking b5 = new Booking(routes.get(4), trains.get(4).getDepartureTimes().get(4), Ticket3);


        bookings.add(b1);
        bookings.add(b2);
        bookings.add(b3);
        bookings.add(b4);
        bookings.add(b5);
    }

    private static void initializePassengers() {
        Passenger p1 = new Passenger("Susan123", "975642", "Susan", "Anne", bookings);
        Passenger p2 = new Passenger("Zain50", "5495642", "Alphonse", "Z", bookings);
        Passenger p3 = new Passenger("Jack", "9772050", "Jack", "Albert", bookings);
        Passenger p4 = new Passenger("Zyad", "5249335", "Zyad", "Samy", bookings);
        Passenger p5 = new Passenger("Salma", "9871546", "Salma", "Ali", bookings);
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);
    }

    
    
    // ###################### Made by Bavly
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
    public static void main(String[] args) {

        initializeAdmins();
        initializeTrains();
        initializeStoppingStations();
        initializeRoutes();
        initializeTickets();
        initializeBookings();
        initializePassengers();
        
        // ###################### Made by Bavly
        // Using the write from files functions for passengers
        // First write the initialized data to the file
        writeArrayList("Passenger", passengers);

        // Then read the initialized data from the file

//        passengers = (ArrayList<Passenger>) readArrayList("Passenger");

        // Only the three functions (add Booking, display Booking, update Booking) are working
        Passenger_specific PS = new Passenger_specific();
        PS.setVisible(true);
        
        // ###################### Made by Aisha and Nadeen
        //1
//        try {
//
//            FileWriter writer = new FileWriter("admin.txt");
//            for (String str : admins) {
//                writer.write(str + System.lineSeparator());
//            }
//            writer.close();
//
//            FileWriter writer2 = new FileWriter("passenger.txt");
//            for (String str : passengers) {
//                writer2.write(str + System.lineSeparator());
//            }
//            writer2.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        int optionA, optionB;
//do {
//
//            System.out.println("Welcome to Cairo Monorail System made by group #14");
//            System.out.println("Please choose one of the following");
//            System.out.println("(0) To Exit");
//            System.out.println("(1) Create Account");
//            System.out.println("(2) login");
//            System.out.println("(3) Delete Account");
//             System.out.println("(4) Manage Account");
//            optionA = input.nextInt();
//
//            switch (optionA) {
//                case 1://(1) Create Account
// System.out.println("Are you an Admin or Passenger");
//                    System.out.println("(1) Admin");
//                    System.out.println("(2) Passenger");
//                    optionB = input.nextInt();
//
//                    switch (optionB) {
//                        case 1:
//                            // Admin info
//                     
//                         System.out.println("Enter a username");
//String u=input.nextLine();
// System.out.println("Enter a password");
//String p=input.nextLine();
//                               Admin ad=new Admin(u,p);
//                            adminData.add(ad);
//                            break;
//                        case 2:
//       
//                         System.out.println("Enter your first name");
//String f=input.nextLine();
// System.out.println("Enter your last name");
//String l=input.nextLine();
//                         System.out.println("Enter a username");
//String u1=input.nextLine();
// System.out.println("Enter a password");
//String pas=input.nextLine();
//                           Passenger pass=new Passenger(u1,pas,f,l,null  ); ////////////need function related to booking here first
//                            passengerData.add(pass);
//                            break;
//                    }
//                    break;
//
//                case 2: //login
// System.out.println("Are you an admin or passenger");
//                    System.out.println("(1) Admin");
//                    System.out.println("(2) Passenger");
//                    optionB = input.nextInt();
//
//                    if (optionB==1){ //admin
//                   
//                          System.out.println("Enter your name");
//                          String u=input.nextLine();
//                          System.out.println("Enter your password");
//                          String p=input.nextLine();
//Admin aa=new Admin();
//aa.login(u,p);
//                       
//                    }
//
//                    else if (optionB==2){ //passenger
//                   
//                          System.out.println("Enter your name");
//                          String u=input.nextLine();
//                          System.out.println("Enter your password");
//                          String p=input.nextLine();
//                       Passenger pp=new Passenger();
//pp.login(u,p);
//                   
//                   
//                    }
//                           
//                    switch (optionB) {
//                        case 1: //admin  
//                        System.out.println("1- Press 1 to add train");
//                        System.out.println("2- Press 2 to remove train");
//                        System.out.println("3- Press 3 to update train");
//                        System.out.println("4- Press 4 to add route");
//                        System.out.println("5- Press 5 to remove route");
//                        System.out.println("6- Press 6 to update route");
//                        System.out.println("7- Press 7 to generate report");
//                         System.out.println("8- Press 8 to display the data of the train");
//                        System.out.println("9- Press 9 to Diplay route");
//                           optionB = input.nextInt();
//                           Admin aa=new Admin();
//                            switch (optionB) {
//                                case 1:
//                                    aa.addTrain();
//                                    break;
//                                case 2:
//                                    aa.removeTrain();
//                                    break;
//                                case 3:
//                                    aa.updateTrain();
//                                    break;
//                                case 4:
//                                    aa.addRoute();
//                                    break;
//                                case 5:
//                                    aa.removeRoute();
//                                    break;
//                                case 6:
//                                    aa.updateRoute();
//                                    break;
//                                case 7:
//                                    aa.GenerateReport();
//                                    break;
//                                            case 8:
//                                               
//                                                //////////////////////////TO DISPLAY THE DATA OF THE TRAIN JUST INITIALIZED WE NEED A  METHOD IN TRAIN CLASS
//                                                trains.display();
//                                                break;
//                                            case 9:
//                                                ////SAME AS TRAINS BUT FOR ROUTES
//                                                routes.displayroute();
//                                                break;
//                            }
//                            adminData.add(aa);
//                           
//                            break;
//                        case 2:
//                            System.out.print("1- Press 1 to add Booking ");
//                            System.out.print("2- Press 2 to Remove Booking ");
//                            System.out.print("3- Press 3 to Edit Booking ");
//                            System.out.print("4- Press 4 to check the availability of the seats ");
//                             System.out.println("5- Press 5 to Diplay route");
//                            optionB = input.nextInt();
//                            Passenger pp=new Passenger();
//                            switch (optionB) {
//                                case 1:
//                                    pp.addBooking();
//                                    break;
//                                case 2:
//                                    pp.removeBooking();
//                                    break;
//                                case 3:
//                                    pp.editBooking();
//                                    break;
//                                case 4:
//                                    System.out.println("Enter number of seats : ");
//                    int q = input.nextInt();
//                                   // t1.isAvailable(q);  //I thik we need them to choose a specific train first then based on  it call the methods
//                                    break;
//                                case 5:
//                                    // r1.displayroute(); //same as the above train case (4)
//                                                break;
//                             
//                            }
//
//                            passengerData.add(pp);
//                            break;
//                    }
//                    break;
//               
//
//case 3: //Delete Account
//               
//                    System.out.println("(1) Admin");
//                    System.out.println("(2) Passenger");
//                    optionB = input.nextInt();
//                    if (optionB==1){
// System.out.println("Enter your name");
//String uu=input.next();
//System.out.println("Enter your password");
//String ppp=input.next();
//Admin a1=new Admin();
//                        a1.deleteAccount(uu);}
//                    else if (optionB==2){
// System.out.println("Enter your name");
//String uu=input.next();
//System.out.println("Enter your password");
//String ppp=input.next();
//Passenger p=new Passenger();
//                            p.deleteAccount(uu);
//}
//                    break;
//
//                        case 4: //Manage Account
//                     //public to rivate such it can only be accessed when logged in
//                       
//                        do {
//        //display menu to user
//        //ask user for his choice and validate it (make sure it is between 1 and 2)
//       
//        System.out.println();
//        System.out.println("1) To modify username ");
//        System.out.println("2) To modify password ");
//        System.out.println("3) Quit");
//        System.out.println();  
//        System.out.print("Enter choice [1-3]: ");
//        //User.choice = u.nextInt();
//        switch (choice) {
//           
//             case 1:
//                System.out.println("Enter new username");
//                    String cn = u.next();
//                    System.out.println("Enter new password");
//                    char c = u.nextchar();
//                    System.out.println(Account.openNewAccount(cn, c) + "Account was created and it has the following number: ");
//                     
//                    break;
//                   
//            case 2:
//                String password;
//                    System.out.println("Enter old one");
//                    old = input.nextLine();
//                    System.out.println("Enter new one");
//                    password = input.nextLine();
//                    while (5 > password.length()) {
//                    System.out.println("Password not secure enough.Enter one with more than 5 characters.");
//                }
//               // userCredentials.replace(username, old, password);
//                   
//                    break;                
//                              }
//
//    }while(optionA>0);
                        // Add a list of options // logout // manageAccount // deleteAccount void


//myFrame f=new myFrame();





}
    
}
