// Final class (2)
public class BabyTech extends JuniorTech{
    public int milk;
    // Asbtract (4)
    public void test(){
        System.out.println("Abstract method");
    }
    public BabyTech(String name, int age, float salary, int projects, int experience, int m){
        super(name,age,salary, projects, experience);
        milk = m;
    }
}
