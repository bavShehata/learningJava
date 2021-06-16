package monorail;

import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

// User defined exception that gets caught whenever a user enters a number out of a range of numbers
class invalidOption extends Exception {

    int a, b;

    invalidOption(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return ("Invalid option, only values between " + a + " and " + b + " inclusive are available");
    }
}

public class Passenger extends User {

    private String firstName;
    private String lastName;
    private static ArrayList<Booking> bookings;

    public Passenger() {
    }

    public Passenger(String username, String password, String firstName, String lastName, ArrayList<Booking> bookings) {
        super(username, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookings = bookings;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public static void addBooking(int seats, Route route, DepartureTime departureTime) {
            ArrayList<Ticket> createdTickets = new ArrayList<>();
            ArrayList<Integer> emptySeats;
  
            // Create the tickets and reserve the seats
            emptySeats = departureTime.retrieveEmptySeats(seats);
            for (int i = 0; i < emptySeats.size(); i++) {
                createdTickets.add(new Ticket(emptySeats.get(i)));
                departureTime.reserveSeat(emptySeats.get(i));
            }
            // Create booking
            bookings.add(new Booking(route, departureTime, createdTickets));

    }

    public static void removeBooking(Booking booking) {

        // unreserve seats and remove booking 
        ArrayList<Ticket> tickets = booking.getTickets();
        for (int i = 0; i < tickets.size(); i++) {
            booking.getDepartureTime().unreserveSeat(tickets.get(i).getSeatNumber());
        }
        bookings.remove(booking);

    }

    public static boolean updateBooking(Booking myBooking, int option, int change, DepartureTime newDepartureTime) {

        switch (option) {
            case 1:
                // If new number is less
                if (change < myBooking.getTickets().size()) {
                    // Unreserve seat(s) and Remove tickets
                    for (int i = 0; i < myBooking.getTickets().size() - change; i++) {
                        myBooking.getDepartureTime().unreserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                        myBooking.getTickets().remove(i);
                    }
                    System.out.println("Number of seats changed successfully ");
                    return true;
                } else {
                    // If new number is more
                    // Check whether available or not
                    ArrayList<Integer> emptySeats = myBooking.getDepartureTime().retrieveEmptySeats(change - myBooking.getTickets().size());
                    if (emptySeats.size() >= change - myBooking.getTickets().size()) {
                        for (int i = 0; i < emptySeats.size(); i++) // Add tickets
                        // Reserve seats
                        {
                            myBooking.getTickets().add(new Ticket(emptySeats.get(i)));
                            myBooking.getDepartureTime().reserveSeat(emptySeats.get(i));
                        }
                        System.out.println("Number of seats changed successfully ");
                        return true;
                    } else {
                        return false;
                    }
                }
            case 2:
                
                // Update Booking, unreserve seats in old booking and reserver seats in new booking
                for (int i = 0; i < myBooking.getTickets().size(); i++) {
                    myBooking.getDepartureTime().unreserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                }
                myBooking.setDepartureTime(newDepartureTime);
                for (int i = 0; i < myBooking.getTickets().size(); i++) {
                    myBooking.getDepartureTime().reserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                }
                System.out.println("Departure time changed successfully ");
                return true;
        }
        
        return false;
    }
        
    public Booking displayBookings() {
        try {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < bookings.size(); i++) {
                System.out.println(i + 1 + "- " + bookings.get(i).display());
            }
            int choice = input.nextInt();
            if (choice > bookings.size() || choice < 1) {
                throw new invalidOption(1, bookings.size());
            }
            return bookings.get(choice - 1);
        } catch (invalidOption msg) {
            System.out.println(msg);
            return new Booking();
        }
    }
}
