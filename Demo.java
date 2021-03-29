import java.util.Scanner;
public class Demo {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        int x = 5;
        System.out.println(x);
        System.out.println("Enter your name buddy");
        String name = input.nextLine();
        String greeting = "Hello there " + name;
        System.out.println(greeting);


        System.out.println("This is " + "concatenation");
    }
}
