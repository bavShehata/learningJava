/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * @author bavshehata
 */
// User defined exception that gets caught whenever a user enters a number out of a range of numbers
import monorail.invalidOption;
public class DepartureTime {

    private int departureTime;
    private ArrayList<Boolean> seats;
    private static Train train;

    public DepartureTime() {
    }

    public DepartureTime(int departureTime, int numberOfSeats, Train train) {
        this.departureTime = departureTime;
        for (int i = 0; i < numberOfSeats; i++) {
            seats.add(false);
        }
        this.train = train;
    }
    // Display available departure times based on number of seats
    public static DepartureTime displayDepartureTimes(int requiredSeats) {
        Scanner input = new Scanner(System.in);
        ArrayList<DepartureTime> allDepartureTimes = train.getDepartureTimes();
        ArrayList<DepartureTime> availableDepartureTimes = new ArrayList<>();
        // Loop through all departure times
        for (int i = 0; i < allDepartureTimes.size(); i++) {
            DepartureTime currentDepartureTime = allDepartureTimes.get(i);
            int available = 0;
            for (int j = 0; j < currentDepartureTime.getSeats().size(); j++) {
                if (currentDepartureTime.getSeats().get(j)) {
                    available++;
                }
            }
            // If the number of available seats is more than required, then add this departure time
            if(requiredSeats <= available) availableDepartureTimes.add(currentDepartureTime);
        }
        // Select one of the available departure times
        for (int i = 0; i< availableDepartureTimes.size();i++)
                System.out.printf("%d- Departure time: %d", i+1, availableDepartureTimes.get(i));
        try{
        int choice = input.nextInt();
        if(choice < 1 || choice > availableDepartureTimes.size()) throw new invalidOption(1,availableDepartureTimes.size());
        return availableDepartureTimes.get(choice-1);
        }
        catch (invalidOption msg) {
            System.out.println(msg);
            return new DepartureTime();
        }
    }

    public void reserveSeat(int seatNumber) {
        seats.set(seatNumber, true);
    }

    public void unreserveSeat(int seatNumber) {
        seats.set(seatNumber, false);
    }
    // Retrieves the seat numbers of empty seats
    public ArrayList<Integer> retrieveEmptySeats(int numberOfSeats) {
        ArrayList<Integer> emptySeatNumbers = new ArrayList<>();
        for (int i = 0, j = 0; i < seats.size() && j < numberOfSeats; i++) {
            if (seats.get(i) == false) {
                emptySeatNumbers.add(i);
                j++;
            }
        }
        return emptySeatNumbers;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Boolean> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Boolean> seats) {
        this.seats = seats;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String display() {
        return "DepartureTime{" + "departureTime=" + departureTime + ", seats=" + seats + ", train=" + train + '}';
    }

}
