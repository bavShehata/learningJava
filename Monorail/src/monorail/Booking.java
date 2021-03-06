package monorail;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Booking {
    private Route route;
    private DepartureTime departureTime;
    private ArrayList<Ticket> tickets;

    public Booking() {
    }

    public Booking(Route route, DepartureTime departureTime, ArrayList<Ticket> tickets) {
        this.route = route;
        this.departureTime = departureTime;
        this.tickets = tickets;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String display() {       
        return "Booking{" + "route=" + route.display() + ", departureTime=" + departureTime.display() +", Number of Tickets: " + tickets.size() +'}';
    }
    
    
}
