/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

public class adminOptions implements ActionListener{
    JFrame f=new JFrame("ADMIN");
    JPanel p1=new JPanel();
     JPanel p2=new JPanel();
     JButton b1=new JButton("LogIN");
     JButton b2=new JButton("Create Account");
    JLabel l=new JLabel("CHOOSE ONE OF THESE OPTIONS : ");
    
    adminOptions(){
        
        b1.setBounds(200,100,250,200);
b2.setBounds(200,100,250,200);

b1.addActionListener(this);
b2.addActionListener(this);

b1.setFocusable(false);
b2.setFocusable(false);


b1.setFont( new Font("Comic Sans", Font.PLAIN,25));
b2.setFont( new Font("Comic Sans", Font.PLAIN,25));

     p1.setBackground(java.awt.Color.cyan);
     p1.setBounds(400,0,400,400);
   
     p1.add(b1);
     
     
     p2.setBackground(java.awt.Color.cyan);
     p2.setBounds(800,0,400,400);
     
p2.add(b2);

        
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setVisible(true);
 f.setResizable(false);
 f.setSize(700,700);
 f.setLayout(new GridLayout(3,3,100,100));
 f.getContentPane().setBackground(java.awt.Color.cyan);
 f.add(p1);
 f.add(p2);
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b1){
 f.dispose();
 logIn l=new logIn();
        b1.setEnabled(false);
    }
    
    
    else if(ae.getSource()==b2){
     f.dispose();
 CreateAccount c=new CreateAccount();
        b2.setEnabled(false);
    }
}
}
