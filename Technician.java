
public class Technician extends Employee {

    private int projects_done;
    public Technician(String name, int age, float salary, int projects){
        super(name,age,salary);
        projects_done = projects;

    }
    // Overriding (1)
    public void display(){
        System.out.println("This is the tech");
    }
    // Final (2)
    public final void show(){
        System.out.println("This can't be changed");
    }
}
