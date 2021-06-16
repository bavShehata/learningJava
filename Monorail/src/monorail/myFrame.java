/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monorail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aissa
 */
public class myFrame extends JFrame implements ActionListener{
    JLabel l=new JLabel("CHOOSE ONE OF THESE OPTIONS : ");
    JPanel pan=new JPanel();
    JPanel pA=new JPanel();
     JPanel pP=new JPanel();
     JButton b1=new JButton("ADMIN");
     JButton b2=new JButton("PASSENGER");
     
    myFrame(){
  b1.setBounds(200,100,250,100);
b2.setBounds(200,100,250,100);

b1.addActionListener(this);
b2.addActionListener(this);

b1.setFocusable(false);
b2.setFocusable(false);


b1.setFont( new Font("Comic Sans", Font.PLAIN,25));
b2.setFont( new Font("Comic Sans", Font.PLAIN,25));


     
    
     l.setFont(new Font("MV Boli",Font.BOLD,18));
     l.setBackground(Color.black);
     l.setBounds(100,0,500,500);
     
      pan.setBackground(Color.LIGHT_GRAY);
     pan.setBounds(0,0,400,400);
     pan.setLayout(new BorderLayout());
     pan.add(l);
     
     pA.setBackground(Color.LIGHT_GRAY);
     pA.setBounds(400,0,400,400);
     pA.add(b1);
     
     pP.setBackground(Color.LIGHT_GRAY);
     pP.setBounds(800,0,400,400);
pP.add(b2);
    
this.setTitle("ADMIN / PASSENGER");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
this.setLayout(new GridLayout(3,3,100,100));
this.setSize(500,500);

this.getContentPane().setBackground(Color.LIGHT_GRAY);
this.setResizable(false);
this.add(pan);
this.add(pA);
this.add(pP);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b1){
 this.dispose();
 adminOptions a=new adminOptions ();
        b1.setEnabled(false);
    }
    
    
    else if(ae.getSource()==b2){
     this.dispose();
     passengerOptions p=new passengerOptions ();
        b2.setEnabled(false);
    }
    }
    
    
}
