package Employee;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage implements ActionListener{
	    JFrame f;
	    JLabel l1,l2;
	    JButton b1,b2,b3,b4;
	    JPanel p1;
		

	
	 MainPage(){
		 
		 f=new JFrame("Employee Detail");
	        f.setBackground(Color.white);
	        f.setLayout(null);
//Panel1
		 
	        
	        
	        l1 = new JLabel();
	        l1.setBounds(350,5,500,400);
	        l1.setForeground(Color.black);
	        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("images/choices.jpg"));
	        l1.setIcon(i1);
	        f.add(l1);
	        
//Panel1
	      
	        p1=new JPanel();
	        BoxLayout boxlayout = new BoxLayout(p1, BoxLayout.Y_AXIS);
	        p1.setLayout(boxlayout);
	        b1=new JButton("Add Employee");
	        b1.setBounds(420,80,100,40);
	        b1.addActionListener(this);
	        p1.add(b1);

	       p1.add(Box.createRigidArea(new Dimension(0, 30)));

	        b2=new JButton("View Employee Details");
	        b2.setBounds(530,80,100,40);
	        b2.addActionListener(this);
	        p1.add(b2);
	        p1.add(Box.createRigidArea(new Dimension(0, 30)));


	        b3=new JButton("Remove Employee");
	        b3.setBounds(420,140,100,40);
	        b3.addActionListener(this);
	        p1.add(b3);
	        p1.add(Box.createRigidArea(new Dimension(0, 30)));


	        b4=new JButton("Update Employee");
	        b4.setBounds(530,140,100,40);
	        b4.addActionListener(this);
	        p1.add(b4);
	        p1.setBounds(100, 100, 400, 201);
            
	        
	        f.add(p1);
	        f.setVisible(true);
	        f.setSize(700,500);
	        f.setLocation(450,200);

	    }

	    public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
	            f.setVisible(false);
	            new Add_Employee();
	        }
	        if(ae.getSource()==b2){
	            f.setVisible(false);
	            new View_Employee();
	        }
	        if(ae.getSource()==b3){
	            f.setVisible(false);
	            new Remove_Employee();
	        }
	        if(ae.getSource()==b4){
	            f.setVisible(false);
	            new Search_Employee();
	        }
	    }


	public static void main(String[] args) {
		MainPage m=new MainPage();
	}

}
