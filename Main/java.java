
package monorail;

import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap;
import java.util.Scanner;

public class Monorail {
        public static ArrayList<Route> routes  = new ArrayList<Route>(); 
        public static ArrayList<Route> trains  = new ArrayList<Route>();
        public static ArrayList<Route> admins  = new ArrayList<Route>();

    public static void main(String[] args) {
        HashMap<String, String> userCredentials = new HashMap<String, String>(); // username as key and password
                                                                                 // as value
        Route r1;
        Route r2;
        Route r3;
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        ArrayList<Train> trains = new ArrayList<Train>();
        Train t1 = new Train(r1, 7, 19, 30, 300);
        Train t2 = new Train(r2, 8, 20, 30, 300);
        Train t3 = new Train(null, 9, 21, 30, 290);
        trains.add(t1);
        trains.add(t2);
        trains.add(t3);
        ArrayList<Admin> admins = new ArrayList<Admin>();
        Admin a1 = new Admin(123455, routes, "admin1", "pass1", trains.subList(0, 1));
        Admin a2 = new Admin(4123, routes, "admin2", "pass2", trains.subList(1, 2));
        Admin a3 = new Admin(1455, routes, "admin3", "pass3", trains.subList(2, 3));
        admins.add(a1);
        admins.add(a2);
        admins.add(a3);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Passenger p1 = new Passenger(5234, routes, "passenger1", "pass1", "Ahmed", "Saad");
        Passenger p2 = new Passenger(6123, routes, "passenger2", "pass2", "Mohamed", "Mohsen");
        Passenger p3 = new Passenger(5622, routes, "passenger3", "pass3", "Mariam", "Ahmed");
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        Scanner input = new Scanner(System.in);
        int optionA, optionB;
                  do {
            System.out.println("Welcome to Cairo Monorail System made by group #14!");
            System.out.println("Please choose one of the following");
            System.out.println("(1) Create Account");
            System.out.println("(2) login");
            System.out.println("(3) Delete Account");
             System.out.println("(4) Manage Account");
            optionA = input.nextInt();
            switch (optionA) {
                case 1:
                    System.out.println("(1) Admin");
                    System.out.println("(2) Passenger");
                    optionB = input.nextInt();
                    switch (optionB) {
                        case 1:
                            // Admin info
                            admins.add(new Admin());
                            break;
                        case 2:
                            // Passenger info
                            passenger.add(new Passenger());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("(1) Admin");
                    System.out.println("(2) Passenger");
                    optionB = input.nextInt();
                    if (optionB==1)
                        a1.login(a1.username,a1.password);
                    else if (optionB==2)
                            p1.login(p1.username,p1.password);
                    switch (optionB) {
                        case 1:   
                        System.out.println("1- Press 1 to add train");
                        System.out.println("2- Press 2 to remove train");
                        System.out.println("3- Press 3 to update train");
                        System.out.println("4- Press 4 to add route");
                        System.out.println("5- Press 5 to remove route");
                        System.out.println("6- Press 6 to update route");
                        System.out.println("7- Press 7 to generate report");
                         System.out.println("8- Press 8 to display the data of the train");
                        System.out.println("9- Press 9 to Diplay route");
                           optionB = input.nextInt();
                            switch (optionB) {
                                case 1:
                                    a1.addTrain();
                                    break;
                                case 2:
                                    a1.removeTrain();
                                    break;
                                case 3:
                                    a1.updateTrain();
                                    break;
                                case 4:
                                    a1.addRoute();
                                    break;
                                case 5:
                                    a1.removeRoute();
                                    break;
                                case 6:
                                    a1.updateRoute();
                                    break;
                                case 7:
                                    a1.GenerateReport();
                                    break;
                                            case 8:
                                                t1.display();
                                                break;
                                            case 9:
                                                r1.displayroute();
                                                break;
                            }
                            // admins.add(new Admin());
                            break;
                        case 2:
                            System.out.print("1- Press 1 to add Booking ");
                            System.out.print("2- Press 2 to Remove Booking ");
                            System.out.print("3- Press 3 to Edit Booking ");
                            System.out.print("4- Press 4 to check the availability of the seats ");
                             System.out.println("5- Press 5 to Diplay route");
                            optionB = input.nextInt();
                            switch (optionB) {
                                case 1:
                                    p1.addBooking();
                                    break;
                                case 2:
                                    p1.removeBooking();
                                    break;
                                case 3:
                                    p1.editBooking();
                                    break;
                                case 4:
                                    System.out.println("Enter number of seats : ");
                    int q = input.nextInt();
                                    t1.isAvailable(q);
                                    break;
                                case 5:
                                     r1.displayroute();
                                                break;
                             
                            }

                            passenger.add(new Passenger());
                            break;
                    }
                    break;
                case 3:
                
                    System.out.println("(1) Admin");
                    System.out.println("(2) Passenger");
                    optionB = input.nextInt();
                    if (optionB==1)
                        a1.deleteAccount(a1.username);
                    else if (optionB==2)
                            p1.deleteAccount(p1.username);
                    break;
                        case 4:
                
                  
                    break;
                    
            }
        } while (optionA > 0);

                    

    }

}