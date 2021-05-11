package monorail;

import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    protected Route route[] = new Route[1];
    protected ArrayList<Integer> departure_time;
    protected ArrayList<Boolean> seats = new ArrayList<Boolean>();

    // numOfseats for user while booking
    // seatsnum number of seats in the train
    public Train(Route route, int firsttrain, int lasttrain, int timebetween, int seatsnum) {
        int available = 0;
        this.route[0] = route;
        for (int i = 0, time = firsttrain; time < lasttrain; time += timebetween, i++) {
            departure_time.set(i, time);
        }
        for (int i = 1; i <= seatsnum; i++) {
            seats.set(i, false);
        }

    }

    public boolean isAvailable(int numOfSeats) {

        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i) == false)
                numOfSeats--;
            if (numOfSeats == 0)
                return true;
        }
        return false;
    }

    // @Override
    public void display() {
        int availableSeats = 0;
        for (int i = 0; i < seats.size(); i++)
            if (seats.get(i) == false)
                availableSeats++;
        System.out.println("Here is the information of the train : ");
        System.out.println(" Route  :  " + route);
        System.out.println(" Departure times  :  ");
        for (int i = 0; i < departure_time.size(); i++)
            System.out.println(" Train  " + i + "  :  " + departure_time.get(i));
        System.out.println(" Number of seats in the train : " + seats.size());
        System.out.println(" Number of available Seats  :  " + availableSeats);
    }

}