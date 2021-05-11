/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m
 */
import java.util.*;

public class Train {
    public static void manageTrain() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to add a train or 2 to remove one");
        choice = input.nextInt();
        Admin c = new Admin();

        while (choice != 0) {

            switch (choice) {

                case 1:
                    c.addTrain();
                    break;
                case 2:
                    c.removeTrain();
                    return;
                case 0:
                    return;

                default:
                    System.out.print("please choose between 1 or 2");
            }
            choice = input.nextInt();

        }
    }

    public static void main(String args[]) {
        Admin c = new Admin();
        ArrayList<Train> train_ID = new ArrayList<>();
        manageTrain();

    }

}