public class Employee {
    private String name;
    private int age;
    private double salary;
    private static int count=0;
    private final static int hours = 20;
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
}
