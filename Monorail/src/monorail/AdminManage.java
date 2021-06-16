
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

public class AdminManage  extends JFrame implements ActionListener{
    //change username and pass
    
     JButton b=new JButton("Submit");
    JTextField text1=new JTextField();
    JTextField text2=new JTextField();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    AdminManage(){
    
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
        
        this.setTitle("Manage Admin Account");
        this.setResizable(false);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
this.setLayout(new GridLayout(3,3,100,100));
this.setSize(500,500);

this.getContentPane().setBackground(Color.orange);
this.add(p1);
this.add(p2);
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
  this.dispose();

    }
    
}
