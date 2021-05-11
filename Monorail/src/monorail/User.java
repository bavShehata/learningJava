
package monorail;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class User {

    Scanner input = new Scanner(System.in);
    protected int ssn;
    protected String username;
    protected String password;
    protected boolean isLoggedIn;
    protected ArrayList<Route> routes = new ArrayList<Route>(); // Add it to the UML
    private HashMap<String, String> userCredentials = new HashMap<String, String>();

    public User(int ssn, ArrayList<Route> routes, String username, String password) {
        this.username = username;
        this.password = password;
        this.ssn = ssn;
        isLoggedIn = false;
        this.routes = routes;
        int len;
        int i = 0;
        boolean exists = false;

        // checking if exist or less than 4
        do {

            len = username.length();
            if (len <= 4) {

                System.out.println("Please enter your username with more than 4 characters");

                username = input.nextLine();
            } else if (username == userCredentials.get(i)) {
                System.out.println("Please enter another username, this one is already taken");
                username = input.nextLine();
            }

            i++;
        } while ((len <= 4) || (exists == false));

        // checking password
        while (password.length() <= 5) {
            System.out.println("Password not secure enough.Enter one with more than 5 characters.");
            password = input.nextLine();
        }
        // adding a user
        userCredentials.put(username, password);
    }

    public void createAccount(String username, String password) {
        int choice;
        this.username = username;
        this.password = password;
        int i = 0;
        do {
            System.out.println("(1) Admin   (2) Passenger");
            choice = input.nextInt();

        } while (choice != 1 && choice != 2);
        System.out.println("Please enter your ssn");
        ssn = input.nextInt();

        do {

            if (username.length() <= 4) {
                System.out.println("Please enter your username with more than 4 characters");
                username = input.nextLine();
            } else if (username == userCredentials.get(i)) {

                System.out.println("Please enter another username, this one is already taken");
                username = input.nextLine();

            }
            i++;
        } while ((username.length() <= 4)); // removed exist variable

        while (password.length() <= 5) {
            System.out.println("Password not secure enough.Enter one with more than 5 characters.");
            password = input.nextLine();
        }

        // adding a user
        userCredentials.put(username, password);

    }

    // public void login(HashMap<String, String> userCredentials)
    public void login(String username, String password) {
        this.username = username;
        this.password = password;

        while (password.length() <= 5) {
            System.out.println("Enter a password with more than 5 characters");
            password = input.nextLine();

        }

        for (int i = 0; i < userCredentials.size(); i++) {
            if (username == userCredentials.get(i)) {

                System.out.println("Welcome " + username);
                isLoggedIn = true;

            }

            else if (i == userCredentials.size()) {
                System.out.println("Account not found");
            }

        }

    }

    public void deleteAccount(String username) {
        this.username = username;
        String value;
        value = userCredentials.get(username);
        if (value != null) {
            userCredentials.remove(username);
            System.out.println("Account deleted successfully");

        } else {
            System.out.println("no account found \n");
        }
    }

    public void manageAccount() {

        int choice;

        System.out.println("To modify username enter 1 ");
        System.out.println("To modify password enter 2 ");
        choice = input.nextInt();
        String old;
        switch (choice) {

            case 1:

                System.out.println("Enter new username");
                username = input.nextLine();

                while (username.length() <= 4) {
                    System.out.println("Username should have more than 4 characters.");
                    username = input.nextLine();
                }
                userCredentials.put(username, password);
                break;

            case 2:

                System.out.println("Enter old one");
                old = input.nextLine();

                System.out.println("Enter new one");
                password = input.nextLine(); // Check for more than 5 characters
                while (password.length() <= 5) {
                    System.out.println("Password not secure enough.Enter one with more than 5 characters.");
                }
                userCredentials.replace(username, old, password);
                break;

            default:
        }

    } // Add a list of options // logout // manageAccount // deleteAccount void

    public void userMenu() {
        if (isLoggedIn) {
            System.out.println("select an option ");
            System.out.println("1-logout ");
            System.out.println("2-manageAccount");
            System.out.println("3-deleteAccount");
            do {
                int option = input.nextInt();

                switch (option) {

                    case 1:
                        isLoggedIn = false;
                        return;

                    case 2:
                        manageAccount();
                        return;
                    case 3:
                        deleteAccount(username);
                        return;

                    default:
                        System.out.println("Please choose one of the options");

                }
            } while (true);
        } else {
            System.out.println("select an option ");
            System.out.println("1- Create an account");
            System.out.println("2- login");
            do {
                int option = input.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Enter the username and password");
                        username = input.nextLine();
                        password = input.nextLine();
                        createAccount(username, password);
                        return;

                    case 2:
                        System.out.println("Enter the username and password");
                        username = input.nextLine();
                        password = input.nextLine();
                        login(username, password);
                        return;

                    default:
                        System.out.println("Please choose one of the options");

                }
            } while (true);
        }
    }
}
