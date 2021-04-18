// Packages (3)
import Faculties.ICS;

public class Employee extends ICS {
    private String name;
// Packages (3)
ICS c1 = new ICS();
Employee c2 = new Employee();

private String deptName = dName;
private int age;
private double salary;
private static int count=0;
private final static int hours = 20;
public Employee(){

}
public Employee(String name, int age, double salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
    count++;
}
public static int getCount(){
    return count;
}
public void setAge(int x){
    age = x;
}
public String toString(){
    return "Employer: " + name + " is " + age + " years old";
}
    private static void main() {
        
    }
    
}
