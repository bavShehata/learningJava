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


        // 5 + 3 // 8
        // 10 / 3 // 3
        // 10 / 3.0 // 3.333
        // 10 % 3 // 1
        x++;
        System.out.println(x/3.0);

        boolean a = true, b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!(a && b): " + !(a && b));


    }
}
