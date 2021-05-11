/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Admin extends User {
    Scanner input = new Scanner(System.in);
    ArrayList<Train> trains;

    public Admin(int ssn, ArrayList<Route> routes, String username, String password, ArrayList<Train> trains) {
        super(ssn, routes, username, password);
        this.trains = trains;
    }

    public void addTrain() {
        int firstTrainDeparture, lastTrainDeparture, timeBetweenTrains;
        int numberOfSeats;
        int routeNo;
        Route route;
        int opt;

        System.out.print("please enter the number of seats");
        numberOfSeats = input.nextInt();
        System.out.print("please enter the first train departure time");
        firstTrainDeparture = input.nextInt();
        System.out.print("please enter the last train departure time");
        lastTrainDeparture = input.nextInt();
        System.out.print("please enter the time between trains");
        timeBetweenTrains = input.nextInt();
        System.out.print("please select the train route");
        for (int i = 0; i < routes.size(); i++) {
            routes.get(i).displayroute();
        }
        routeNo = input.nextInt();
        route = routes.get(routeNo);
        trains.add(new Train(route, firstTrainDeparture, lastTrainDeparture, timeBetweenTrains, numberOfSeats));
        System.out.print("Train added successfully");

    }

    public void removeTrain() {
        int trainNo, confirm;
        for (int i = 0; i < trains.size(); i++) {
            System.out.print(trains.get(i));
        }
        System.out.println("please select the train you want to remove");
        trainNo = input.nextInt();
        System.out.println("Are you sure you want to remove" + " " + trainNo);
        System.out.println("press (0) to cancel and (1) to confirm");
        confirm = input.nextInt();
        if (confirm == 1) {
            trains.remove(trainNo);
        }

    }

    public void updateTrain() {
        int updateTrain;
        int seatNum;
        int train_id;
        int dept;
        int opt;
        Train train;
        String route;
        for (int i = 0; i < trains.size(); i++) {
            System.out.println("Please choose train to modify");
            trains.get(i).display();
        }
        updateTrain = input.nextInt();
        train = trains.get(updateTrain);
        System.out.println("choose 1 to update number of seats , 2 to update departure times");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                System.out.print(" please enter the new number of seats");
                seatNum = input.nextInt();
                if (trains.get(updateTrain).seats.size() <= seatNum)
                    for (int i = 0; i < trains.size() - seatNum; i++) {
                        train.seats.remove(i);
                    }
                else {
                    for (int i = 0; i < seatNum - trains.size(); i++) {
                        train.seats.add(false);
                    }
                    break;
                }

            case 2:
                System.out.print("please enter the first train departure time");
                int firstTrainDeparture = input.nextInt();
                System.out.print("please enter the last train departure time");
                int lastTrainDeparture = input.nextInt();
                System.out.print("please enter the time between trains");
                int timeBetweenTrains = input.nextInt();
                for (int i = 0, time = firstTrainDeparture; time < lastTrainDeparture; time += timeBetweenTrains, i++) {
                    train.departure_time.set(i, time);
                }
                break;

        }

    }

    public void addRoute() {
        ArrayList<String> stations = new ArrayList<>();
        int numOfstations;
        int distance;
        double ticket_fare;
        Train train;
        int trainNumber;
        String stName;
        System.out.println(" please enter the number of stations");
        numOfstations = input.nextInt();
        System.out.println(" please enter Station name");
        for (int i = 0; i < numOfstations; i++) {
            System.out.println("Station" + " " + i + 1 + " :");
            stName = input.nextLine();
            stations.add(stName);
        }
        System.out.println("please add the distance");
        distance = input.nextInt();
        System.out.println("please add the ticket fare");
        ticket_fare = input.nextInt();
        System.out.println("please add a train to the route");
        for (int i = 0; i < trains.size(); i++)
            trains.get(i).display();

        trainNumber = input.nextInt();
        train = trains.get(trainNumber);

        System.out.println("Are you sure you want to add this route: ");
        routes.add(new Route(stations, ticket_fare, distance, train));

        System.out.println(" the route info have been successsfully added");

    }

    public void removeRoute() {
        int confirm;
        int route;
        for (int i = 0; routes.size() >= i; i++)
            routes.get(i).displayroute();

        System.out.println("please select the route that you want to remove");
        route = input.nextInt();
        System.out.print("Are you sure you want to remove" + " " + route);
        System.out.print("Press one to continue or zero to exit");
        confirm = input.nextInt();
        if (confirm == 1) {
            routes.remove(route);
            System.out.println("Route removed successfully");
        }

    }

    public void assignTrain() {
        int routeNum, trainNum;

        System.out.println("Choose route number : ");
        for (int i = 0; i < routes.size(); i++)
            if (routes.get(i).train[0] == null) {

                System.out.println(i + "  ");
                routes.get(i).displayroute();
            }
        routeNum = input.nextInt();
        System.out.println("Choose Train number : ");
        for (int i = 0; i < trains.size(); i++)
            if (trains.get(i).route[0] == null) {

                System.out.println(i + "  ");
                trains.get(i).display();
            }
        trainNum = input.nextInt();
        trains.get(trainNum).route[0] = routes.get(routeNum);
        routes.get(routeNum).train[0] = trains.get(trainNum);

    }

    public void updateRoute() {
        int opt;
        int stationNumber;
        Route route;
        int chooseRoute;
        double ticketF;
        int dist;
        int numOfstations;
        int Stations;
        String modify;
        System.out.println("please select the route :");
        for (int i = 1; i <= routes.size(); i++) {
            routes.get(i).displayroute();
        }
        chooseRoute = input.nextInt();
        routes.get(chooseRoute).displayroute();
        route = routes.get(chooseRoute);
        System.out.println("press 1 to modify stations, 2 to modify ticket fare, 3 to modify distance");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                opt = input.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("please enter the station you want to add ");
                        modify = input.nextLine();
                        route.stoppingStations.add(modify);
                        break;
                    case 2:
                        System.out.println("please enter the station you want to remove ");
                        Stations = input.nextInt();
                        break;
                   
                }
                break;
            case 2:
                System.out.println(" please enter the new ticket fare");
                ticketF = input.nextDouble();
                route.ticketFare = ticketF;
                break;
            case 3:
                System.out.println(" please enter the new distance");
                dist = input.nextInt();
                route.distance = dist;
                break;
        }
    }

    public void GenerateReport() {

        double totalticket = 0.0;
        int passengerNumber = 0;
        Route route;
        int routeNumber;
        for (int i = 0; routes.size() >= i; i++)
            routes.get(i).displayroute();

        System.out.println("please select the route that you want to generate a report about");
        routeNumber = input.nextInt();
        route = routes.get(routeNumber);
        System.out.println(" Total Passengers : " + passengerNumber);
        System.out.println(" Total Ticket : " + totalticket);

    }
}
