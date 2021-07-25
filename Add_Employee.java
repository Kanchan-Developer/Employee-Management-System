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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Add_Employee extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10 ,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b,b1,b2;


    Add_Employee(int i){}
    
    Add_Employee(){
       setTitle("Add Employee");
       setBackground(Color.white);
       setLayout(null);
       setSize(900, 700);
       setLocation(400, 150);
       setVisible(true);

      l12=new JLabel();
      l12.setBounds(0,0,900,700);
      l12.setLayout(null);
      ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/addemp.jpg"));
      Image i=img.getImage().getScaledInstance(900, 700,Image.SCALE_DEFAULT);
      ImageIcon i2=new ImageIcon(i);
      l12.setIcon(i2);
  

      
      l11 = new JLabel("New Employee Details");
      l11.setBounds(320,30,500,50);
      l11.setFont(new Font("serif",Font.ITALIC,25));
      l11.setForeground(Color.black);
      l12.add(l11);
      add(l12);

      
      l1 = new JLabel("Employee Id");
      l1.setBounds(50,150,150,30);
      l1.setFont(new Font("serif",Font.BOLD,20));
      l12.add(l1);

       t1=new JTextField();
       t1.setBounds(200,150,150,30);
       l12.add(t1);

       l2 = new JLabel("Name");
       l2.setBounds(400,150,100,30);
       l2.setFont(new Font("serif",Font.BOLD,20));
       l12.add(l2);

       t2=new JTextField();
       t2.setBounds(600,150,150,30);
       l12.add(t2);

      l3= new JLabel("Father's Name");
      l3.setBounds(50,200,200,30);
      l3.setFont(new Font("serif",Font.BOLD,20));
      l12.add(l3);

       t3=new JTextField();
       t3.setBounds(200,200,150,30);
       l12.add(t3);

       l4= new JLabel("Age");  
       l4.setBounds(400,200,200,30);
       l4.setFont(new Font("serif",Font.BOLD,20));
       l12.add(l4);

       t4=new JTextField();
       t4.setBounds(600,200,150,30);
       l12.add(t4);

       l5= new JLabel("Date of Birth");
       l5.setBounds(50,250,100,30);
       l5.setFont(new Font("serif",Font.BOLD,20));
       l12.add(l5);

       t5=new JTextField();
       t5.setBounds(200,250,150,30);
       l12.add(t5);

       l6= new JLabel("Address");
       l6.setBounds(400,250,100,30);
       l6.setFont(new Font("serif",Font.BOLD,20));
      l12.add(l6);

       t6=new JTextField();
       t6.setBounds(600,250,150,30);
       l12.add(t6);

      l7= new JLabel("Phone");
      l7.setBounds(50,300,100,30);
      l7.setFont(new Font("serif",Font.BOLD,20));
      l12.add(l7);

       t7=new JTextField();
       t7.setBounds(200,300,150,30);
       l12.add(t7);

       l8= new JLabel("Email Id");
       l8.setBounds(400,300,100,30);
       l8.setFont(new Font("serif",Font.BOLD,20));    
       l12.add(l8);

       t8=new JTextField();
       t8.setBounds(600,300,150,30);
       l12.add(t8);

     l9= new JLabel("Education");
     l9.setBounds(50,350,100,30);
     l9.setFont(new Font("serif",Font.BOLD,20));
      l12.add(l9);

       t9=new JTextField();
       t9.setBounds(200,350,150,30);
      l12.add(t9);


      l10= new JLabel("Job Post");
      l10.setBounds(400,350,150,30);
      l10.setFont(new Font("serif",Font.BOLD,20));
       l12.add(l10);

       t10=new JTextField();
       t10.setBounds(600,350,150,30);
       l12.add(t10);

      
       l13= new JLabel("Adhaar Number");
       l13.setBounds(50,400,150,30);
       l13.setFont(new Font("serif",Font.BOLD,20));
       l12.add(l13);
      
       t11=new JTextField();   
       t11.setBounds(200,400,150,30);
      l12.add(t11);

       

       l14=new JLabel();
       l14.setBounds(200,450,250,200);
	   l12.add(l14);

       l15=new JLabel("");
       l15.setBounds(600,450,250,200);
       l12.add(l15);

       b = new JButton("Submit");
       b.setBackground(Color.BLACK);
       b.setForeground(Color.WHITE);
       b.setBounds(250,550,150,40);
       
      l12.add(b);

       b1=new JButton("Cancel");   
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.setBounds(450,550,150,40);
       
      l12.add(b1);
       
       b.addActionListener(this);
       b1.addActionListener(this);
       
       setVisible(true);
       setSize(900,700);
       setLocation(400,150);
   }

   public void actionPerformed(ActionEvent ae){
       
       String a = t1.getText();
       String bb = t2.getText();
       String c = t3.getText();
       String d = t4.getText();
       String e = t5.getText();
       String ff = t6.getText();
       String g = t7.getText();
       String h = t8.getText();
       String i = t9.getText();
       String j = t10.getText();
       String k = t11.getText();
       if(ae.getSource() == b){
           try{
              ConFile cc = new ConFile();
               String q = "insert into emp values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
               cc.st.executeUpdate(q);
               JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
               setVisible(false);
               new MainPage();
           }catch(Exception ee){
               System.out.println("The error is:"+ee);
           }
       }else if(ae.getSource() == b1){
           setVisible(false);
           new MainPage();
       }
   }
	
	
	public static void main(String[] args) {
		
		Add_Employee e=new Add_Employee();
		

	}

	

}
