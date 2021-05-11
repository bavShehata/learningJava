import java.util.ArrayList;

import java.util.Scanner;

public class User {
    // Add a list of options
    // logout
    // manageAccount
    // deleteAccount
    Scanner input = new Scanner(System.in);

    protected int ssn;
    private String username;
    private String password;
    private String email;
    protected boolean isLoggedIn = false;
    // Change arraylists to hashmaps
    static ArrayList<String> newUser = new ArrayList<String>();
    static ArrayList<String> passWords = new ArrayList<String>();
    static ArrayList<Integer> id = new ArrayList<Integer>();

    public void createAccount() {
        System.out.println("Please enter your ssn");
        ssn = input.nextInt();
        id.add(ssn);
        int l;
        do {
            System.out.println("Please enter your username with more than 4 characters");
            username = input.nextLine();
            l = username.length();
        } while (l <= 4);
        newUser.add(username);

        System.out.println("Please enter your email");
        email = input.nextLine();

        for (int i = 0; i <= email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            }

            else {
                if (i == email.length()) {
                    System.out.println("Inalid email");
                }
            }
        }
        // the same as username
        System.out.println("Enter a password");
        password = input.nextLine();

        if (password.length() <= 5) {
            System.out.println("Password not secure enough.Enter one with more than 5 characters.");
        }

        else {
            passWords.add(password);
        }

    }

    public void login() {

        System.out.println("Please enter your username");
        username = input.nextLine();

        int index;
        for (int i = 0; i <= newUser.size(); i++) {
            if (username == newUser.get(i)) {
                index = i;
                System.out.println("Enter your password");
                password = input.nextLine();

                if (password == passWords.get(index)) {
                    System.out.println("Welcome " + username);
                    isLoggedIn = true;
                    break;
                } else {
                    System.out.println("Incorrect password");
                    break;
                }

            } else {
                System.out.println("Username not found");
            }
        }

    }

    public void deleteAccount() {

        System.out.println("Enter user ssn");
        ssn = input.nextInt();

        for (int m = 0; m <= id.size(); m++) {
            if (ssn == id.get(m)) {
                id.remove(m);
                newUser.remove(m);
                passWords.remove(m);
                System.out.println("Account deleted successfully");
                break;
            }

            else {
                if (m == id.size()) {
                    System.out.println("User not found");
                }
            }
        }

    }

    public void manageAccount() {

        int choice;

        System.out.println("To modify username enter 1");
        System.out.println("To modify password enter 2");
        choice = input.nextInt();

        switch (choice) {

            case 1:

                System.out.println("Enter a new username");
                username = input.nextLine();
                break;

            case 2:

                System.out.println("Enter new one");
                password = input.nextLine();
                // Check for more than 5 characters
                break;

            default:
        }

    }
}
