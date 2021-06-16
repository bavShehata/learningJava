/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aissa
 */
public class PassengerManage extends JFrame implements ActionListener {
     
     JButton b=new JButton("Submit");
    JTextField text1=new JTextField();
    JTextField text2=new JTextField();
        JTextField text3=new JTextField();
            JTextField text4=new JTextField();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
      JPanel p3=new JPanel();
      JPanel p4=new JPanel();
    
    PassengerManage(){
    
        text1.setText("First name");
        text1.setPreferredSize(new Dimension(200,50));
        text1.setFont(new Font("Consolas",Font.BOLD,18));
       text1.setForeground(Color.black);

        text2.setText("Last name");
        text2.setPreferredSize(new Dimension(200,50));
        text2.setFont(new Font("Consolas",Font.BOLD,18));
       text2.setForeground(Color.black);

        text3.setText("Username");
        text3.setPreferredSize(new Dimension(200,50));
        text3.setFont(new Font("Consolas",Font.BOLD,18));
       text3.setForeground(Color.black);
       
           text4.setText("Password");
        text4.setPreferredSize(new Dimension(200,50));
        text4.setFont(new Font("Consolas",Font.BOLD,18));
       text4.setForeground(Color.black);
       
        p1.setBackground(java.awt.Color.orange);
     p1.setBounds(200,0,200,200);
     p1.add(text1);
       p2.setBackground(java.awt.Color.orange);
     p2.setBounds(200,0,200,200);
     p2.add(text2);
       p3.setBackground(java.awt.Color.orange);
     p3.setBounds(200,0,200,200);
     p3.add(text3);
         p4.setBackground(java.awt.Color.orange);
     p4.setBounds(200,0,200,200);
     p4.add(text4);
     
     b.addActionListener(this);
        p4.add(b);
        
        
        this.setTitle("Modify Passanger Data");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
this.setLayout(new GridLayout(3,3,10,10));
this.setSize(500,500);
this.setResizable(false);
this.getContentPane().setBackground(Color.orange);
this.add(p1);
this.add(p2);
this.add(p3);
this.add(p4);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.dispose();
    }
    
    
}
