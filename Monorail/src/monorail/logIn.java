
package monorail;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class logIn extends JFrame implements ActionListener{
    
     JButton b=new JButton("Submit");
    JTextField text1=new JTextField();
    JTextField text2=new JTextField();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    logIn(){
     
b.setBounds(200,100,250,200);

b.addActionListener(this);

b.setFocusable(false);


b.setFont( new Font("Comic Sans", Font.PLAIN,25));

        text1.setText("Username");
        
        text1.setPreferredSize(new Dimension(250,50));
        //font
        text1.setFont(new Font("Consolas",Font.BOLD,35));
     
       //font color
       text1.setForeground(Color.black);
       
    
         p1.setBackground(java.awt.Color.orange);
     p1.setBounds(400,0,400,400);
   
     p1.add(text1);
    //   text1.setCaretColor(Color.);
     
    text2.setText("Password");
    
        text2.setPreferredSize(new Dimension(250,50));
        //font
        text2.setFont(new Font("Consolas",Font.BOLD,35));
        
        
       //font color
       text2.setForeground(Color.black);
       
      
         p2.setBackground(java.awt.Color.orange);
     p2.setBounds(400,0,400,400);
   
     p2.add(text2);
    //   text1.setCaretColor(Color.);
     p2.add(b);
   
       
     b.addActionListener(this);
        
        this.setTitle("LogIn Page");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
this.setLayout(new GridLayout(3,3,100,100));
this.setSize(500,500);
this.setResizable(false);
this.getContentPane().setBackground(Color.black);
this.add(p1);
this.add(p2);
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       this.dispose();
       
    //   String s=JOptionPane.showInputDialog("Choose 1 to delete your account, 2 to manage delete it and 3 to logout");
       String s= JOptionPane.showInputDialog( null,"Choose 1 to delete your account, 2 to manage delete it and 3 to logout","Taking Input", JOptionPane.PLAIN_MESSAGE);
      char opt=s.charAt(0);
      
       switch(opt){
       
           case '1':
               //delete
               String u=JOptionPane.showInputDialog("Are you sure? Enter 1 for yes and 0 for no");
 

               if(u.charAt(0)=='1'){
           myFrame m=new myFrame();    
               }
               
               break;
           case '2':
               //admin: change username and pass
               //pas: uname, pass, last name, first name, redirect anywhere you wish
                String v=JOptionPane.showInputDialog(" Enter 1 for admin and 0 for passenger");
                if(v.charAt(0)=='1'){
                //manage account for admin
                new AdminManage();
                }
                
                else{
                //manage account for passenger
                PassengerManage ps=new PassengerManage();
                
                }
               break;
               
           case '3':
               //logout
               //pop up to ask if sure
               //redirect to main page gui
                String u2=JOptionPane.showInputDialog("Are you sure? Enter 1 for yes and 0 for no");
               if(u2.charAt(0)=='1'){
           myFrame m2=new myFrame();    
               }
               break;
       
       
       }
    }
    
}
