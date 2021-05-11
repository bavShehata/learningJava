package monorail;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Passenger extends User{
    Scanner input = new Scanner(System.in);

    protected String firstName;
    protected String lastName;
    private ArrayList<Booking> bookings = new ArrayList<Booking>(); // Add it to the UML
    
    public Passenger(int ssn, ArrayList<Route> routes, String username, String password, String firstName, String lastName){
        super(ssn, routes, username, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void addBooking() {
        int seats, routeNumber, confirm, deptTime,choice;
        Route route;
        System.out.println("How many seats do you want to book?");
        seats = input.nextInt();
        System.out.println("Which route are you taking?");
        for(int i  = 0; i < routes.size(); i++){
            System.out.println("(" + i + ")");
            routes.get(i).displayroute();
        }
        routeNumber = input.nextInt();
        route = routes.get(routeNumber);
        System.out.println(
                "Pick the train with the most suitable departure time, please note it takes 5 minutes between each station.");
        for (int i = 0; i < route.train[0].departure_time.size(); i++)
            System.out.println("(" + i + ") " + route.train[0].departure_time.get(i));
       
        choice = input.nextInt();
        deptTime = route.train[0].departure_time.get(choice);
        System.out.println("Here is the booking info: ");
        System.out.printf("Name: %s %s %n", firstName, lastName);
        System.out.printf("SSn: %s %n", ssn); // Still needed
        System.out.printf("Number of seats: %d %n", seats);
        System.out.printf("Route number: %d %n", route);
        System.out.printf("Train departure time: %s %n", deptTime); // Still needed
        System.out.println("(0) Cancel    (1) Confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            bookings.add(new Booking(route, deptTime, seats));
        } else {
            return;
        }
    }

    public void removeBooking() {
        int booking, confirm;
        for (int i = 0; i < bookings.size(); i++)
            bookings.get(i).displayBooking();
        System.out.println("Pick the booking that you'd want deleted");
        booking = input.nextInt();
        System.out.println("Are you sure you want to delete this booking?");
        System.out.println("(0) Cancel    (1) Confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            bookings.remove(booking);
        } else {
            return;
        }

    }

    public void editBooking() {
        int booking, confirm, done, option, change;
        Booking myBooking;
        // display all bockings
        for (int i = 0; i < bookings.size(); i++)
            bookings.get(i).displayBooking();
        System.out.println("Pick the booking that you'd want to edit");
        booking = input.nextInt();
        myBooking = bookings.get(booking);
        do {
            myBooking.displayBooking();
            System.out.println("What would you like to edit?");
            System.out.printf("1 - Number of seats. %n");
            System.out.printf("2 - Train departure time. %n");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("New number of seats: ");
                    change = input.nextInt();
                    if (change < myBooking.tickets.size()) {
                        for (int i = 0; i < myBooking.tickets.size() - change; i++)
                            myBooking.tickets.remove(i);
                        System.out.println("Number of seats changed successfully ");

                    } else {
                        for (int i = 0; i < change - myBooking.tickets.size(); i++)
                            myBooking.tickets.add(i);
                        System.out.println("Number of seats changed successfully ");
                    }
                    break;
                case 2:
                    // Display available train departure times
                    System.out.println("New departure time: ");
                    for (int i = 0; i < myBooking.route.train[0].departure_time.size(); i++)
                       System.out.println("(" + i + ") " + myBooking.route.train[0].departure_time.get(i));
                    change = input.nextInt();
                    // Update Booking
                    myBooking.departureTime = myBooking.route.train[0].departure_time.get(change);
                    System.out.println("Departure time changed successfully ");
                    break;
            }
            System.out.println("Would you like to edit anything else?");
            System.out.println("(1) Yes    (2) No");
            done = input.nextInt();
        } while (done != 1);
        System.out.println("Here is the new ticket info: ");
        System.out.printf("Name: %s %s %n", firstName, lastName);
        System.out.printf("SSn: %s %n", ssn);
        System.out.printf("Number of seats: %s %n", myBooking.tickets.size());
        System.out.printf("Train departure time: %s %n%n", myBooking.departureTime);
    }
}
