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
    private ArrayList<Booking> bookings;

    public Passenger() {
    }

    public Passenger(String username, String password, String firstName, String lastName, ArrayList<Booking> bookings) {
        super(username, password);
        this.firstName = firstName;
        this.lastName = lastName;
        bookings = new ArrayList<Booking>();
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

    public void addBooking() {
        try {
            Scanner input = new Scanner(System.in);
            ArrayList<Ticket> createdTickets = new ArrayList<>();
            int seats;
            ArrayList<Integer> emptySeats;
            Route route;
            DepartureTime departureTime;
            // Ask for number of seats
            System.out.println("How many seats do you want to book?");
            seats = input.nextInt();
            if (seats < 1 || seats > 10) {
                throw new invalidOption(1, 10);
            }
            // Display all assigned routes and pick one
            route = Admin.displayRoutes(false);
            // Display all departure times of the train with available seats
            departureTime = DepartureTime.displayDepartureTimes(seats);
            // Print the booking info
            System.out.println("Here is the booking info: ");
            System.out.printf("Name: %s %s %n", firstName, lastName);
            System.out.printf("Number of seats: %d %n", seats);
            System.out.printf("Origin - Destination:  %s - %s %n", route.getOrigin(), route.getDestination());
            System.out.printf("Train departure time: %d %n", departureTime.getDepartureTime());
            // Create the tickets and reserve the seats
            emptySeats = departureTime.retrieveEmptySeats(seats);
            for (int i = 0; i < emptySeats.size(); i++) {
                createdTickets.add(new Ticket(emptySeats.get(i)));
                departureTime.reserveSeat(emptySeats.get(i));
            }
            // Create booking
            bookings.add(new Booking(route, departureTime, createdTickets));
        } catch (invalidOption msg) {
            System.out.println(msg);
            
        }
    }

    public void removeBooking() {
        try {
            Scanner input = new Scanner(System.in);
            int confirm;
            Booking booking;
            // display booking
            booking = displayBookings();
            System.out.println("Are you sure you want to delete this booking?");
            // confirm
            System.out.println("(1) Cancel    (2) Confirm");
            confirm = input.nextInt();
            if (confirm == 1) {
                // unreserve seats and remove booking 
                ArrayList<Ticket> tickets = booking.getTickets();
                for (int i = 0; i < tickets.size(); i++) {
                    booking.getDepartureTime().unreserveSeat(tickets.get(i).getSeatNumber());
                }
                bookings.remove(booking);

            } else if (confirm != 2) {
                throw new invalidOption(1, 2);
            }
        } catch (invalidOption msg) {
            System.out.println(msg);
        }
    }

    public void editBooking() {
        try {
            Scanner input = new Scanner(System.in);
            int done = 1, option, change;
            Booking myBooking;
            // Pick a specific booking
            myBooking = displayBookings();
            do {
                // Picking a field to edit
                myBooking.display();
                System.out.println("What would you like to edit?");
                System.out.printf("1 - Number of seats. %n");
                System.out.printf("2 - Train departure time. %n");
                option = input.nextInt();
                switch (option) {
                    case 1:
                        // Ask for the new number of seats
                        System.out.println("New number of seats: ");
                        change = input.nextInt();
                        // If new number is less
                        if (change < myBooking.getTickets().size()) {
                            // Unreserve seat(s) and Remove tickets
                            for (int i = 0; i < myBooking.getTickets().size() - change; i++) {
                                myBooking.getDepartureTime().unreserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                                myBooking.getTickets().remove(i);
                            }
                            System.out.println("Number of seats changed successfully ");
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
                            }
                        }
                        break;
                    case 2:
                        // Display available train departure times with the same number of seats
                        DepartureTime newDepartureTime = DepartureTime.displayDepartureTimes(myBooking.getTickets().size());
                        // Update Booking, unreserve seats in old booking and reserver seats in new booking
                        for (int i = 0; i < myBooking.getTickets().size(); i++) {
                            myBooking.getDepartureTime().unreserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                        }
                        myBooking.setDepartureTime(newDepartureTime);
                        for (int i = 0; i < myBooking.getTickets().size(); i++) {
                            myBooking.getDepartureTime().reserveSeat(myBooking.getTickets().get(i).getSeatNumber());
                        }
                        System.out.println("Departure time changed successfully ");
                        break;
                    default:
                        throw new invalidOption(1, 2);
                }
                System.out.println("Would you like to edit anything else?");
                System.out.println("(1) Yes    (2) No");
                done = input.nextInt();

            } while (done != 1);
            // display final info
            System.out.println("Here is the new booking info: ");
            System.out.printf("Name: %s %s %n", firstName, lastName);
            System.out.println(myBooking.display());
        } catch (invalidOption msg) {
            System.out.println(msg);
        }
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
