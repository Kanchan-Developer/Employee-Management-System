package Employee;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener {
	 JFrame f;
	    JLabel l1,l2;
	    JTextField t1;
	    JPasswordField t2;
	    JButton b1,b2;

	    login(){

	        f=new JFrame("Login");

	        f.setBackground(Color.white);
	        f.setLayout(null);

	        l1 = new JLabel("Username");
	        l1.setBounds(40,20,100,30);
	        f.add(l1);
	        
	        l2 = new JLabel("Password");
	        l2.setBounds(40,70,100,30);
	        f.add(l2);
	 
	        t1=new JTextField();
	        t1.setBounds(150,20,150,30);
	        f.add(t1);

	        t2=new JPasswordField();
	        t2.setBounds(150,70,150,30);
	        f.add(t2);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
	        ImageIcon i3 =  new ImageIcon(i2);
	        JLabel l3 = new JLabel(i3);
	        l3.setBounds(350,20,150,150);
	        f.add(l3);


	        b1 = new JButton("Login");
	        b1.setBounds(40,140,120,30);
	       // b1.setFont(new Font("serif",Font.BOLD,15));
	        b1.addActionListener(this);
	        b1.setBackground(Color.BLUE);
	        b1.setForeground(Color.WHITE);
	        f.add(b1);

	        b2=new JButton("Cancel");
	        b2.setBounds(180,140,120,30);
	       // b2.setFont(new Font("serif",Font.BOLD,15));
	        b2.setBackground(Color.BLUE);
	        b2.setForeground(Color.WHITE);
	        f.add(b2);

	        b2.addActionListener(this);
	        
	      
	        f.setVisible(true);
	        f.setSize(600,300);
	        f.setLocation(400,300);

	    }

	public static void main(String[] args) {
		login l=new login();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1)
{
        try{
            ConFile c1 = new ConFile();
            String u = t1.getText();
            @SuppressWarnings("deprecation")
			String v = t2.getText();
            
            String q = "select * from login where name='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.st.executeQuery(q); 
            if(rs.next()){
                new MainPage().f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                f.setVisible(false);
            }
        }catch(Exception ea){
            ea.printStackTrace();
        }
}
if(e.getSource()==b2)
{
	f.setVisible(false);
}
	}

}
