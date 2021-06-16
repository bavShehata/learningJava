package Part5Example;


import java.io.*;

public class Vehicle  {

    int license_num;

    public Vehicle() {
    }

    public Vehicle(int license_num) {
        this.license_num = license_num;
    }
    
   
   
    @Override
    public String toString() {
        return "Vehicle{" + "license_num=" + license_num + '}';
    }
   

}
