/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.*;

/**
 *
 * @author m
 */
public class Admin extends User {
    public ArrayList<Train> train = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    // Change Train_id to trainId
    int Train_id;
    int firstDigit;

    public void addTrain() {
        // Take the rest of the needed train info from the admin
        System.out.print("please enter the train id");
        Train_id = trainID.nextInt();
        firstDigit = Integer.parseInt(Integer.toString(Train_id).substring(0, 1));
        // Check 6 digits, Check it's unique
        if (firstDigit != 2) {

            System.out.print("Ids must start with 2, please enter a correct one!");
            Train_id = trainID.nextInt();
        } else
            Trains.add(new Train(Train_id));
        System.out.print("Train added: " + Train_id);
        System.out.print(Trains);

    }

    public void removeTrain(ArrayList<Train> Trains) {
        System.out.print("please enter the train id");
        Train_id = trainID.nextInt();
        // Check that the train exists
        firstDigit = Integer.parseInt(Integer.toString(Train_id).substring(0, 1));
        if (firstDigit != 2) {
            System.out.print("Ids must start with 2, please enter a correct one!");
            Train_id = trainID.nextInt();

        } else
            Trains.remove(new Train(Train_id));
        System.out.print("Train removed: " + Train_id);

    }

}