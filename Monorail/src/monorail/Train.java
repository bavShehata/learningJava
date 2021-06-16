package monorail;

import java.util.ArrayList;

public class Train {
    Route route = new Route();
    private ArrayList<DepartureTime> departureTimes;
    private ArrayList<Integer> seats ;
     //constructor
    public Train(Route route,ArrayList<DepartureTime> departure_times,int seatsnum){
         this.route = route;
         this.departureTimes = departure_times;
         seats = new ArrayList<Integer>();
          for (int i = 1; i <= seatsnum; i++) {
             seats.add(i);
        }
    }
    //Setters
    public void setRoute (Route route){
        this.route=route;
    }
      public void setDepartureTimes( ArrayList<DepartureTime> departureTimes){
 this.departureTimes = departureTimes;   
}
      public void setSeats( ArrayList<Integer> seats){
 this.seats = seats;   
}
      //getters
      public Route getRoute (){
          return route;
      }
      public  ArrayList<DepartureTime> getDepartureTimes (){
          return departureTimes;
      }
public  ArrayList<Integer> getSeats (){
          return seats;
      }
    // @Override
//display the data of the train
    public String display() {
        return ("Here is the information of the train : \n Route  :  \n" + route + "\n Departure times  :  \n"+ getDepartureTimes () +"\n Number of seats in the train : \n" + seats.size());
    }
}