package monorail;

import java.util.ArrayList;

public class Route {

    private String origin;
    private String destination;
    ArrayList<String> stoppingStations;
    private double ticketFare;
    private double distance;
    protected Train train ;
    
    // CONSTRUCTOR
public Route ()
{};
    public Route(ArrayList<String> stoppingStations, double ticketFare, double distance, Train train) {
        this.origin = stoppingStations.get(0);
        this.destination = stoppingStations.get(stoppingStations.size() - 1);
        stoppingStations.remove(0);
        stoppingStations.remove(stoppingStations.size() - 1);
        this.stoppingStations = stoppingStations;
        this.ticketFare = ticketFare;
        this.distance = distance;
        this.train = train;
    }
    //Setters
    public void setOrigin(String origin ){
    this.origin=origin;
}
    
     public void setDestination(String destination ){
    this.destination=destination;
}
     
     public void setStoppingStations( ArrayList<String> stoppingStations){
 this.stoppingStations = stoppingStations;   
}
     
     public void setTicketFare (double ticketFare){
    this.ticketFare=ticketFare;
}
     
     public void setDistance (double distance){
    this.distance=distance;
}
     public void setTrain (Train train){
         this.train=train;
     }
     
     //Getters
public String getOrigin(){
    return origin;
}

public String getDestination(){
    return destination;
}

public  ArrayList<String> getStoppingStations (){
    return stoppingStations;
}

public double getTicketFare (){
    return ticketFare;
}

public double getDistance (){
    return distance;
}
//display the data of the route
    public String display() {
        System.out.println("The origin is: " + origin);
        System.out.println("The destination is: " + destination);
        System.out.println("The stopping stations are:");
        for (int i = 0; i < stoppingStations.size(); i++)
            System.out.print(stoppingStations.get(i) + "   ");
        System.out.println("The ticket fare is: " + ticketFare + "EGP");
        System.out.println("The distance is: " + distance + "meters");
        if (train == null)
         return("The origin is: " + origin+"The destination is: " + destination);
        else
           return("The origin is: " + origin+" The destination is: " + destination +'\n');

    }

}