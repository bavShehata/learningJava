
package passenger;

import java.util.Scanner;

/**
 *
 * @author bavshehata
 */
public class Passenger {

    Scanner input = new Scanner(System.in);

    protected String firstName;
    protected String lastName;

    public void addBooking() {
        int seats, route, confirm;
        System.out.println("How many seats do you want to book?");
        seats = input.nextInt();
        System.out.println("Which route are you taking?");
        // Display routes
        route = input.nextInt();
        System.out.println(
                "Pick the train with the most suitable departure time, please note it takes 5 minutes between each station.");
        // Display trains with available seats, and their departure times
        System.out.println("Here is the ticket info: ");
        System.out.printf("Name: %s %s %n", firstName, lastName);
        System.out.printf("SSn: %s %n", "SSn"); // Still needed
        System.out.printf("Route number: %d %n", route);
        System.out.printf("Train departure time: %s %n", "departureTime"); // Still needed
        System.out.printf("Number of seats: %d %n", seats);
        System.out.println("(0) Cancel    (1) Confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            // createTicket;
        } else {
            return;
        }
    }

    public void removeBooking() {
        int booking, confirm;
        // displayAllTickets
        System.out.println("Pick the booking that you'd want deleted");
        booking = input.nextInt();
        System.out.println("Are you sure you want to delete this booking?");
        // displayBooking
        System.out.println("(0) Cancel    (1) Confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            // deleteTicket;
        } else {
            return;
        }

    }

    public void editBooking() {
        int booking, confirm, done, option, change;
        // displayAllTickets
        System.out.println("Pick the booking that you'd want to edit");
        booking = input.nextInt();
        do {
            // displayBooking
            System.out.println("What would you like to edit?");
            System.out.printf("1 - Number of seats. %n");
            System.out.printf("2 - Route number. %n");
            System.out.printf("3 - Train departure time. %n"); // Still needed
            option = input.nextInt();
            switch (option) {
                case 1:

                    System.out.println("New number of seats: ");
                    change = input.nextInt();
                    // Check availabilty
                    // Update Booking
                    System.out.println("Number of seats changed successfully ");
                    break;
                case 2:
                    // Display routes
                    System.out.println("New route: ");
                    change = input.nextInt();
                    // Update Booking
                    System.out.println("Route changed successfully ");
                    break;
                case 3:
                    // Display available train departure times
                    System.out.println("New departure time: ");
                    change = inputenextInt();
                    // Update Booking
                    System.out.println("Departure time changed successfully ");
                    break;
            }
            System.out.println("Would you liked to edit anything else?");
            System.out.println("(1) Yes    (2) No");
            done = input.nextInt();
        } while (done != 1);
        System.out.println("Here is the new ticket info: ");
        System.out.printf("Name: %s %s %n", firstName, lastName);
        System.out.printf("SSn: %s %n", "SSn"); // Still needed
        System.out.printf("Number of seats: %d %n", seats);
        System.out.printf("Route number: %d %n", route);
        System.out.printf("Train departure time: %s %n", "departureTime"); // Still needed
        System.out.println("(0) Cancel    (1) Confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            // updateBooking
        } else {
            return;
        }
    }
}
