public final class JuniorTech extends Technician{
    private int experienceYears;
    public JuniorTech(String name, int age, float salary, int projects, int experience){
        super(name,age,salary, projects);
        experienceYears = experience;

    }
    // Overriding (1)
    public void display(){
        super.display(); // optional
        System.out.println("And the junior dude");
    }

    // Final (2)
    public final void show(){
        System.out.println("This won't work");
    }
}
