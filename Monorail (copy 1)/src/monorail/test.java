package monorail;

import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap;
import java.util.Scanner;

public class Monorail {

    public static void main(String[] args) {
  

//1
ArrayList<Admin> adminData=new ArrayList<Admin>();
adminData.add("Amr","12345679");
adminData.add("Ali","12300679");
adminData.add("Zara","55545679");


//2
ArrayList< Passenger> passengerData=new ArrayList< Passenger>();

passengerData.add("Susan123","975642","Susan","Anne");
passengerData.add("Zain50","5495642","Alphonse","Z");
passengerData.add("Jack","9772050","Jack","Albert");

      //3
      ArrayList <Train> trains=new ArrayList<Train>();
      trains.add(null,null,100); 
       trains.add(null,null,150);
        trains.add(null,null,90); 
          
        
//4
               //arraylist of string having all stations
      
 
HasMap<String,String> OriginDestination=new HashMap<String,String>();
OriginDestination.put("Free zone","American Universiity");
OriginDestination.put("Middle Ring Road","Maadi");
OriginDestination.put("Attaba","Maadi");

//5
           ArrayList<String> stoppingStations= new ArrayList<String>();
           stoppingStations.add("Free zone");
          stoppingStations.add("Maadi");
            stoppingStations.add("Kit-Kat");


//6
ArrayList<Route> routes = new ArrayList<Route>();
   routes.add(OriginDestination.getKey(OriginDestination,"Free zone"),OriginDestination.get("Free zone"),stoppingStations.get(0),7.5,1000,null);
 routes.add(OriginDestination.getKey(OriginDestination,"Attaba"),OriginDestination.get("Attaba"),stoppingStations.get(1),10.0,2000,null);
       routes.add(OriginDestination.getKey(OriginDestination,"Middle Ring Road"),OriginDestination.get("Middle Ring Road"),stoppingStations.get(2),5.0,3000,null);
     
       
     
     //8
     
     ArrayList<Integer> Ticket=new ArrayList<Integer>();
     Ticket.add(1,5);
          Ticket.add(2,10);
              Ticket.add(3,16);    
     
              //9
        ArrayList<Booking> bookings = new ArrayList<Booking>();
 bookings.add(route.get(2),dept.get(2),Ticket.get(2));
         bookings.add(route.get(1),dept.get(1),Ticket.get(1));
       bookings.add(route.get(3),dept.get(3),Ticket.get(3));
     
       
           Admin a1=new Admin();
          Passenger p1=new Passenger();
        Scanner input = new Scanner(System.in);
        int optionA, optionB;
                  do {
            System.out.println("Welcome to Cairo Monorail System made by group #14");
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
                            adminData.add(new Admin());
                            break;
                        case 2:
                            // Passenger info
                            passengerData.add(new Passenger());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("(1) Admin");
                    System.out.println("(2) Passenger");
                    optionB = input.nextInt();
                    if (optionB==1){
                    
                          System.out.println("Enter your name"):
                          String u=input.nextLine();
                          System.out.println("Enter your password"):
                          String p=input.nextLine();
                        a1.login(u,p);
                    }
                    else if (optionB==2){
                   
                          System.out.println("Enter your name"):
                          String u=input.nextLine();
                          System.out.println("Enter your password"):
                          String p=input.nextLine();
                        p1.login(u,p);
                    
                    
                    }
                           
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
                                                
                                                //////////////////////////TO DISPLAY THE DATA OF THE TRAIN JUST INITIALIZED WE NEED A  METHOD IN TRAIN CLASS 
                                                trains.display();
                                                break;
                                            case 9:
                                                ////SAME AS TRAINS BUT FOR ROUTES
                                                routes.displayroute();
                                                break;
                            }
                            adminData.add(a1);
                            
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
                                    t1.isAvailable(q);  //I thik we need them to choose a specific train first then based on  it call the methods
                                    break;
                                case 5:
                                     r1.displayroute(); //same as the above train case (4)
                                                break;
                             
                            }

                            passengerData.add(p1);
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
                ??????????????????????????????
                  
                    break;
                    
            }
        } while (optionA > 0);

                    

    


    }
    
}