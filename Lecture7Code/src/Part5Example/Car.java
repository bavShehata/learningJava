/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part5Example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Car extends Vehicle implements Serializable{
    int speed;
    
    public Car(int license_num, int speed) {
        super(license_num);
        this.speed = speed;
    }
    
     ////////////////////////////////////////////////////////////////////
    private void writeObject(ObjectOutputStream o) throws IOException {
        o.writeInt(license_num);
        o.writeInt(speed);
    }
    ////////////////////////////////////////////////////////////////////
     private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException 
    {       
        license_num = aInputStream.readInt();
        speed = aInputStream.readInt();        
    }
     /////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Car{" + "licensenum=" + license_num+ ", speed=" + speed + '}';
    }
    
    
    
}
