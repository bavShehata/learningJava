// Final class (2)
// Abstract class(4)
public abstract class JuniorTech extends Technician{
    private int experienceYears;
    public JuniorTech(String name, int age, float salary, int projects, int experience){
        super(name,age,salary, projects);
        experienceYears = experience;
    }
    public void display(){
        super.display(); // optional
        System.out.println("And the junior dude");
    }
    // Abstract method(4)
    public abstract void test();
    // public final void show(){
    //     System.out.println("This won't work");
    // }
}
