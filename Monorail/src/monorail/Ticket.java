/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.io.Serializable;
/**
 *
 * @author bavshehata
 */
public class Ticket implements Serializable {
    private int id;
    private int seatNumber;
    static private int count = 0;

    public Ticket() {
    }

    public Ticket(int seatNumber) {
        this.seatNumber = seatNumber;
        id = incrementAndGetCount();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }

    public int getId() {
        return id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public static int incrementAndGetCount() {
        return ++count;
    }

    public String display() {
        return "Ticket{" + "id=" + id + ", seatNumber=" + (seatNumber + 1) + '}';
    }
    
}
