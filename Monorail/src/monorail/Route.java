/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.util.ArrayList;

public class Route {

    protected String origin;
    protected String destination;
    protected ArrayList<String> stoppingStations;
    protected double ticketFare;
    protected double distance;
    protected Train train[] = new Train[1];

    // CONSTRUCTOR

    public Route(ArrayList<String> stoppingStations, double ticketFare, double distance, Train train) {
        this.origin = stoppingStations.get(0);
        this.destination = stoppingStations.get(stoppingStations.size() - 1);
        stoppingStations.remove(0);
        stoppingStations.remove(stoppingStations.size() - 1);
        this.stoppingStations = stoppingStations;
        this.ticketFare = ticketFare;
        this.distance = distance;
        this.train[0] = train;
    }

    public void displayroute() {
        System.out.println("The origin is: " + origin);
        System.out.println("The destination is: " + destination);
        System.out.println("The stopping stations are:");
        for (int i = 0; i < stoppingStations.size(); i++)
            System.out.print(stoppingStations.get(i) + "   ");
        System.out.println("The fare is: " + ticketFare + "EGP");
        System.out.println("The distance is: " + distance + "meters");
        if (train[0] == null)
            System.out.println("No trains are assigned to this route");
        else
            System.out.println("There is a train assigned to this route");

    }
}