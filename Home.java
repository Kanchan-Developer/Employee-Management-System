package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b;
	
  public Home()
	{
	  // Image can not be inserted directly we required ImageIcon
	  ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("images/empicon.jpg"));
	  Image i=ic.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);  //Image object for image scaling
	  ImageIcon i2=new ImageIcon(i);
	  
	  //adding icon to JLabel
	  l1=new JLabel(i2);
	  l1.setBounds(0,150,1360,530);
	  add(l1);
	  
	  //JButton
	  b = new JButton("CLICK HERE TO CONTINUE");
      b.setBackground(Color.BLACK);
      b.setForeground(Color.WHITE);
      b.setBounds(500,600,300,70);
      b.addActionListener(this);
 
      //Label to add Button
      l2=new JLabel();
      l2.setBounds(0,0,1360,750);
      l2.setLayout(null);
      
 

      l3=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
      l3.setBounds(80,30,1500,100);
      l3.setFont(new Font("serif",Font.PLAIN,70));
      l3.setForeground(Color.BLUE);
      add(l3);

      l2.add(b);
      add(l2);
      
      
    //  getContentPane().setBackground(Color.WHITE);
      setTitle("Employe Management System ");
	  setBackground(Color.BLUE);
	  setLayout(null);
	  setVisible(true);
      setSize(1360,750);
      setLocation(200,100);

      

  }
	  
  @Override
	public void actionPerformed(ActionEvent a) {
		  if(a.getSource()==b)
		    {
	            setVisible(false);
	            new login();   
	         }
		  }	  
	    


	public static void main(String[] args) {
		Home h=new Home();

	}

	
		
	}


