package monorail;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Booking {
    protected Route route;
    protected int departureTime;
    protected ArrayList<Integer> tickets;

    public Booking(Route route, int departureTime, int seats) {
        // Search for the route in the route list by id
        this.route = route;
        this.departureTime = departureTime;
        for (int i = 0; i < seats; i++){
            tickets.add(i);
        }
//        Train train = routes[routeNumber].train;
//        for (int i = 0; i < seats; i++)
//            // Check available seats using the train object
//            for (int j = 0; j < train.seat.size(); j++)
//                if (train.seat.get(j) == 0)
//                // Use the ticket constructor to add a ticket
//                {
//                    tickets.add(j);
//                    train.seat.set(j, 1);
//                }
    }

    public void displayBooking() {
        System.out.printf("Origin %s %n", route.origin);
        System.out.printf("Destination %s %n", route.destination);
        System.out.printf("Distance %d %n", route.distance);
        System.out.printf("Number of tickets %d %n", tickets.size());
        System.out.printf("Total cost %d %n", tickets.size() * route.ticketFare);
        System.out.print("Seats: ");
        for (int i = 0; i < tickets.size(); i++)
            System.out.printf("%d, ", tickets.get(i));
        System.out.printf("%n%n");
    }
}
