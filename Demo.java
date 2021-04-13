import java.util.Scanner;

public class Demo {

    // Methods (2)

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum_arr(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int x = 5;
        // int y = 3;
        // x = ++y;
        // String name = "Bavly";
        // name = input.nextLine();
        // System.out.println(name.charAt(0));
        // System.out.println(x);
        // int i;
        // for (i = 0; i < 5; i++)
        // System.out.println(i);
        // while (i > 0) System.out.println(i--);

        // Arrays (1)

        // int x;
        // x = input.nextInt();
        // int[] arr = new int[x];
        // System.out.println(arr.length);
        // arr[0] = 3;
        // int[] a = {0,1,2};

        // Methods (2)

        // System.out.println(sum(4, 2));
        // int[] arr = { 1, 2, 3, 4 };
        // System.out.println(sum_arr(arr));

        // Classes (3)

        Employee e1 = new Employee("bavly", 18, 2500.50);
        Employee e2 = new Employee("bavly", 18, 2500.50);
        Employee e3 = new Employee("bavly", 18, 2500.50);
        Employee[] Emp_arr = new Employee[5];
        Emp_arr[0] = new Employee("Ahmed", 20, 1234);
        // e1.setAge(5);
        System.out.println(Employee.getCount());

    }
}
