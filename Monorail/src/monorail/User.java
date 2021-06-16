
package monorail;

import java.util.HashMap;
import java.util.Scanner;

    
public  class User {

    public static class ThrowsExecp{
      
       public void throwMethod(){ System.out.println("Please enter the correct data");
          
    }
}
   public static class ThrowsTaken{
   
   
   public void takenUserName(){
   System.out.println("Please enter another username, this one is already taken");
   }
   } 

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    protected String username;
    protected String password;
    protected boolean isLoggedIn;

    private HashMap<String, String> userCredentials;
    
public User(){
    username="Default name";
    password="none123";
}
   
   public User( String username, String password) {
       
        this.username = username;
        this.password = password;
//        isLoggedIn = false;
//      
//        int len;
//       
//        boolean exists = false;
//
// 
//       
//        do {
//
//            len = username.length();
//            if (len <= 4) {
//
//                System.out.println("Please enter your username with more than 4 characters");
//
//                username = input.nextLine();
//            } else if (userCredentials.containsKey(username)) {
//                System.out.println("Please enter another username, this one is already taken");
//                username = input.nextLine();
//            }
//
//          
//        } while ((len <= 4) || (exists == false));
//
// 
//        while (password.length() <= 5) {
//            ThrowsExecp t=new ThrowsExecp();
//            t.throwMethod();
//            System.out.println("Password not secure enough.Enter one with more than 5 characters.");
//            password = input.nextLine();
//        }
//        // adding a user
//        userCredentials.put(username, password);
    }

    public void createAccount(String username, String password) {
        int choice;
        this.username = username;
        this.password = password;
       
        do {
            System.out.println("(1) Admin   (2) Passenger");
            choice = input.nextInt();

        } while (choice != 1 && choice != 2);
        

        do {

            if (username.length() <= 4) {
                System.out.println("Please enter your username with more than 4 characters");
                username = input.next();
            } 
            else {
              
if(userCredentials.containsKey(username)){
                ThrowsTaken tk=new ThrowsTaken();
                tk.takenUserName();
                username = input.nextLine();
            }
            }
          
        } while ((username.length() <= 4)); // removed exist variable

        while (password.length() <= 5) {
            System.out.println("Password not secure enough.Enter one with more than 5 characters.");
            password = input.next();
        }

      
        userCredentials.put(username, password);

    }

  public void login(String username, String password) {
        this.username = username;
        this.password = password;

        while (password.length() <= 5) {
            System.out.println("Enter a password with more than 5 characters");
            password = input.nextLine();

        }

        for (int i = 0; i < userCredentials.size(); i++) {
            
            if ( userCredentials.containsKey(username)) {

                System.out.println("Welcome " + username);
                isLoggedIn = true;

            }

            else  {
                
                
                System.out.println("Account not found");
                
                return ;
        }

    } }

  public void deleteAccount(String username){
        this.username = username;
        String value;
        value = userCredentials.get(username);
        if (value != null) {
            userCredentials.remove(username);
            System.out.println("Account deleted successfully");

        } 
        else {
            System.out.println("no account found \n");
          
        }
   
    }

  
    public void manageAccount(String u,String p) {

        int choice;

        System.out.println("To modify username enter 1 ");
        System.out.println("To modify password enter 2 ");
        choice = input.nextInt();
        String oldU=u, oldP=p;
        
        switch (choice) {

            case 1:

                System.out.println("Enter new username");
                username = input.nextLine();

                while (username.length() <= 4) {
                    System.out.println("Username should have more than 4 characters.");
                    username = input2.nextLine();
                }
                password=p;
             userCredentials.remove(oldU);

                userCredentials.put(username, password);
                break;

            case 2:

                System.out.println("Enter new one");
                password = input2.nextLine(); // Check for more than 5 characters
                while (password.length() <= 5) {
                    System.out.println("Password not secure enough.Enter one with more than 5 characters.");
                }
                userCredentials.replace(username, oldP, password);
                break;

           
        }

    }
    }


    


