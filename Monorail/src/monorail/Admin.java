package monorail;

import java.util.Scanner;
import java.util.ArrayList;

class adminException1 extends Exception {

    int a;

    public adminException1(int a) {

        this.a = a;
    }

    @Override
    public String toString() {
        return ("please choose from the list");
    }
}

class reportExceptions extends ArrayIndexOutOfBoundsException {

    int r;

    reportExceptions(int r) {
        this.r = r;

    }

    @Override
    public String toString() {
        return ("route does not exist!");
    }
}

public class Admin extends User {

    Scanner input = new Scanner(System.in);
    ArrayList<Train> trains;
    ArrayList<Route> routes = new ArrayList<>();

    public Admin(String username, String password) {
        super(username, password);
        this.trains = trains;
    }

//this function take the data of the new train to be added in the system and assign it to a an empty route (route has no train)
    public void addTrain() {
        ArrayList<DepartureTime> departureTimes = new ArrayList<>();
        int firstTrainDeparture, lastTrainDeparture, timeBetweenTrains, trainNo, numberOfSeats, routeNo, opt;
        System.out.print("Please enter the number of seats");
        numberOfSeats = input.nextInt();
        System.out.print("Please enter the first train departure time");
        firstTrainDeparture = input.nextInt();
        System.out.print("Please enter the last train departure time");
        lastTrainDeparture = input.nextInt();
        System.out.print("Please enter the time between trains");
        timeBetweenTrains = input.nextInt();

// Assign the new depature_time arraylist
        System.out.print("Please select the train route");
        // Display all routes with no trains
        for (int i = 0; i < Monorail.routes.size(); i++) {
            if (Monorail.routes.get(i).train == null) {
                Monorail.routes.get(i).display();
            }
        }
        routeNo = input.nextInt();

        try {

            Monorail.routes.get(routeNo);
            throw new adminException1(routeNo);

        } catch (adminException1 excep) {
            System.out.println(excep);
        }

        // add train
        System.out.println("Are you sure you want to add this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int c = input.nextInt();
        if (c == 1) {
            Train t1 = new Train(Monorail.routes.get(routeNo), null, numberOfSeats);
            Monorail.trains.add(t1);
            for (int time = firstTrainDeparture; time < lastTrainDeparture; time += timeBetweenTrains) {
                departureTimes.add(new DepartureTime(time, numberOfSeats, t1));
            }
            t1.setDepartureTimes(departureTimes);
            System.out.print("The Train has been added successfully");
            System.out.print("The route has been filled successfully");
        } else {
        }
    }

    //this function remove the data of the train that would be removed from the system then its route would be empty (route has no train)
    public void removeTrain() {
        int trainNo, confirm;
        System.out.print("Please select a train");
        for (int i = 0; i < Monorail.trains.size(); i++) {
            Monorail.trains.get(i).display();
        }
        trainNo = input.nextInt();
        System.out.println("Are you sure you want to add this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int c = input.nextInt();
        if (c == 1) {
            // Delete train
            Monorail.trains.remove(trainNo);
            Monorail.trains.get(trainNo).route = null;

            System.out.print("The Train has been deleted successfully");
            System.out.print("The route of the deleted train has been set to null");
        } else {
        }
    }

    //this function updates the data of an existing train
    public void updateTrain() {
        ArrayList<DepartureTime> departureTimes = new ArrayList<>();
        System.out.println("Choose a train : ");
        for (int i = 0; i < Monorail.trains.size(); i++) {
            Monorail.trains.get(i).display();
        }
        int trainNo = input.nextInt();
        Train t1 = Monorail.trains.get(trainNo);
        int seatNum, opt, numberOfSeats;
        numberOfSeats = t1.getSeats().size();
        System.out.println("Choose a number :");
        System.out.println("1- Update number of seats ");
        System.out.println("2- Update departure times");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Please enter the new number of seats : ");
                seatNum = input.nextInt();
                // If the number of new seats is less
                if (Monorail.trains.get(trainNo).getSeats().size() > seatNum) {
                    // Remove the extra seats
                    for (int i = 0; i < Monorail.trains.size() - seatNum; i++) {
                        Monorail.trains.get(trainNo).getSeats().remove(i);
                    }
                } else {
                    // Add extra seats
                    for (int i = 0; i < seatNum - Monorail.trains.size(); i++) {
                        Monorail.trains.get(trainNo).getSeats().add(i);
                    }
                }
                System.out.print("The number of seats in the train has been updated successfully");
                break;
            case 2:
                System.out.print("Please enter the first train departure time");
                int firstTrainDeparture = input.nextInt();
                System.out.print("Please enter the last train departure time");
                int lastTrainDeparture = input.nextInt();
                System.out.print("Please enter the time between trains");
                int timeBetweenTrains = input.nextInt();
                // Assign the new depature_time arraylist
                for (int time = firstTrainDeparture; time < lastTrainDeparture; time += timeBetweenTrains) {
                    departureTimes.add(new DepartureTime(time, numberOfSeats, t1));
                }
                Monorail.trains.get(trainNo).setDepartureTimes(departureTimes);
                System.out.print("The departure times of the train has been updated successfully");
                break;
        }
    }

    //This function add a new route to the system 
    public void addRoute() {
        ArrayList<String> stations = new ArrayList<>();
        int numOfstations, distance, trainNumber;
        double ticket_fare;
        String stName, origin, destination;
        Train train;
        System.out.println(" Please enter the number of stations");
        numOfstations = input.nextInt();
        System.out.println(" Please enter Stations name");
        for (int i = 0; i < numOfstations; i++) {
            System.out.println("Station" + " " + i + 1 + " :");
            stName = input.nextLine();
            stations.add(stName);
        }
        System.out.println("Please add the distance");
        distance = input.nextInt();
        System.out.println("Please add the ticket fare");
        ticket_fare = input.nextDouble();
        System.out.println("Please add a train to the route");
        // Display unassignedTrain
        for (int i = 0; i < Monorail.trains.size(); i++) {
            if (Monorail.trains.get(i).route == null) {
                System.out.println(i + 1);
                Monorail.trains.get(i).display();
            }
        }
        trainNumber = input.nextInt();
        train = Monorail.trains.get(trainNumber);
        System.out.println("Are you sure you want to add this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int c = input.nextInt();
        switch (c) {
            case (1):
                Monorail.routes.add(new Route(stations, ticket_fare, distance, train));
                System.out.println("The route info has been added successsfully ");
                break;
            case (2):
                break;
        }
    }

    //This function update an existing route in the system 
    public void updateRoute() {
        int opt, stationNumber, choosenRoute, dist, numOfstations, Station;
        double ticketF;
        String modify;
        System.out.println("Please select the route that you want to update :");
        for (int i = 0; i < Monorail.routes.size(); i++) {
            Monorail.routes.get(i).display();
        }
        choosenRoute = input.nextInt();
        Monorail.routes.get(choosenRoute).display();
        //routes.get(choosenRoute);
        System.out.println("Press 1 to modify stations");
        System.out.println("      2 to modify ticket fare");
        System.out.println("      3 to modify distance");
        opt = input.nextInt();
        switch (opt) {
            case 1:
                for (int i = 0; i < (Monorail.routes.get(choosenRoute).stoppingStations).size(); i++) {
                    Monorail.routes.get(choosenRoute).getStoppingStation();
                }
                System.out.println("Press 1 to add station");
                System.out.println("      2 to remove station");
                opt = input.nextInt();
                switch (opt) {
                    // Add
                    case 1:
                        System.out.println("Press 1 to add an origin");
                        System.out.println("      2 to add stopping station");
                        System.out.println("      3 to add destination");
                        int op = input.nextInt();
                        System.out.println("please enter the station you want to add ");
                        modify = input.nextLine();
                        switch (op) {
                            case (1):
                                //origin
                                Monorail.routes.get(choosenRoute).stoppingStations.add(0, modify);
                                break;
                            case (2):
                                //stopping stations
                                System.out.println("Which is the index of the station that you want to replace the new station with?");
                                int in = input.nextInt();
                                Monorail.routes.get(choosenRoute).stoppingStations.add(in, modify);
                                break;
                            case (3):
                                //destination  
                                Monorail.routes.get(choosenRoute).stoppingStations.add(modify);
                                break;
                        }
                        break;
                    case 2:
                        // Remove station
                        System.out.println("Please enter the number of the station you want to remove ");
                        Station = input.nextInt();
                        Monorail.routes.get(choosenRoute).stoppingStations.remove(Station);
                        break;
                }
                break;
            case 2:
                System.out.println(" Please enter the new ticket fare");
                ticketF = input.nextDouble();
                Monorail.routes.get(choosenRoute).setTicketFare(ticketF);
                break;
            case 3:
                System.out.println(" Please enter the new distance");
                dist = input.nextInt();
                Monorail.routes.get(choosenRoute).setDistance(dist);
                break;
        }
    }

//This function remove an existing route in the system and if this route has a train assigned to it the train will be unassigned to any route unless we update this train (using the udate train function)
    public void removeRoute() {
        int c, route;
        // Display the routes routes
        System.out.println("Choose route number : ");
        for (int i = 0; i < Monorail.routes.size(); i++) {
            Monorail.routes.get(i).display();
        }
        int choosenRoute = input.nextInt();
        Monorail.routes.get(choosenRoute).display();
        System.out.println("Are you sure you want to remove this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        c = input.nextInt();
        if (c == 1) {
            Monorail.routes.remove(choosenRoute);
            System.out.println("Route has been removed successfully");
        } else {
        }
    }

//This function assign an existing train, that doesn't assigned to any route, to an empty route
    public void assignTrain() {
        int routeNum, trainNum;
        System.out.println("Choose route number : ");
        for (int i = 0; i < Monorail.routes.size(); i++) {
            if (Monorail.routes.get(i).train == null) {
                Monorail.routes.get(i).display();
            }
        }
        routeNum = input.nextInt();
        System.out.println("Choose Train number : ");
        for (int j = 0; j < Monorail.trains.size(); j++) {
            if (Monorail.trains.get(j).route == null) {
                Monorail.trains.get(j).display();
            }
        }
        trainNum = input.nextInt();
        System.out.println("Are you sure you want to assign this train to this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int c = input.nextInt();
        if (c == 1) {
            Monorail.trains.get(trainNum).route = Monorail.routes.get(routeNum);
            Monorail.routes.get(routeNum).train = Monorail.trains.get(trainNum);
        } else {
        }
    }

//This function unassign route and then it will lead to an unassigned route and an unassigned train
    public void unassignedRoute() {
        int routeNum, trainNum;
        System.out.println("Choose train number : ");
        for (int i = 0; i < Monorail.trains.size(); i++) {
            if (Monorail.trains.get(i).route == null) {
                Monorail.trains.get(i).display();
            }
        }
        trainNum = input.nextInt();
        System.out.println("Choose route number : ");
        for (int j = 0; j < Monorail.routes.size(); j++) {
            if (Monorail.routes.get(j).train == null) {
                Monorail.routes.get(j).display();
            }
        }
        routeNum = input.nextInt();
        System.out.println("Are you sure you want to assign this train to this route: ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        int c = input.nextInt();
        if (c == 1) {
            Monorail.routes.get(routeNum).train = null;
            Monorail.trains.get(trainNum).route = null;
        } else {
        }
    }

    //this function take a boolean exeprission that represent if this train is assigned or not (assigned=1 , unassigned=0) then display the unassigned trains or the trains with its routes if assigned = true the user 
    //also can choose a train to review its details
    public String displayTrains(boolean assigned) {
        int trainnum;
        if (assigned == false) {
            System.out.print("Here are the unassigned trains : ");
            for (int i = 0; i < Monorail.trains.size(); i++) {
                if (Monorail.trains.get(i).route == null) {
                    Monorail.trains.get(i).display();
                }
            }
        } else {
            System.out.print("Here are all the trains : ");
            for (int i = 0; i < Monorail.trains.size(); i++) {
                Monorail.trains.get(i).display();
                System.out.println("Its train :  ");
                Monorail.trains.get(i).route.display();
            }
            System.out.println("Choose a train number to view all its details : ");
            for (int i = 0; i < Monorail.trains.size(); i++) {
                Monorail.trains.get(i).display();
            }
        }
        Train t11;
        trainnum = input.nextInt();
        t11 = Monorail.trains.get(trainnum);
        return t11.display();
    }

    //this function take a boolean exeprission that represent if this route is assigned or not (assigned=1 , unassigned=0) then display the unassigned routes or the routes with its trains if assigned = true the user 
    //also can choose a route to review its details
    public String displayRoutes(boolean assigned) {

        int routenum;
        if (assigned == false) {
            System.out.print("Here are the unassigned routes : ");
            for (int i = 0; i < Monorail.routes.size(); i++) {
                if (Monorail.routes.get(i).train == null) {
                    Monorail.routes.get(i).display();
                }
            }
        } else {
            System.out.print("Here are all the routes : ");

            for (int j = 0; j < Monorail.routes.size(); j++) {
                System.out.println("Route " + (j + 1));
                Monorail.routes.get(j).display();

                System.out.println("from (origin): ");

                Monorail.routes.get(j).getStoppingStation();

                System.out.println(" to (destination) : ");

                Monorail.routes.get(j).getDestination();
                System.out.println("Train : ");
                Monorail.routes.get(j).train.display();
            }
        }
        System.out.println("Choose route to view all its details : ");
        for (int i = 0; i < Monorail.routes.size(); i++) {
            Monorail.routes.get(i).display();
        }
        Route r11;
        routenum = input.nextInt();
        r11 = Monorail.routes.get(routenum);
        return r11.display();
    }

    public void GenerateReport() {
        double totalticket = 0.0;
        int passengerNumber = 0;
        Booking book;
        int routeNumber;
        Route route;
        System.out.println("Please Select a route ");
        for (int i = 0; i < Monorail.routes.size(); i++) {
            Monorail.routes.get(i).display();
        }
        try {
            routeNumber = input.nextInt();
            route = Monorail.routes.get(routeNumber);
            double ticket = Monorail.routes.get(routeNumber).getTicketFare();
            totalticket = ticket * passengerNumber;
            System.out.println(" Total Passengers : " + passengerNumber);
            System.out.println(" Total Ticket : " + totalticket);
            throw new reportExceptions(routeNumber);
        } catch (reportExceptions excep) {
            System.out.print("invalid number!");
        }
    }
}
