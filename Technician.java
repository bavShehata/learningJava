
public class Technician extends Employee {

    private int projects_done;
    public Technician(String name, int age, float salary, int projects){
        super(name,age,salary);
        projects_done = projects;

    }
    public void display(){
        System.out.println("This is the tech");
    }
    public final void show(){
        System.out.println("This can't be changed");
    }
}
