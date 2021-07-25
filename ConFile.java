package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public  class ConFile {
	public Connection con;
	public Statement st;
	
	public ConFile()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
			st=con.createStatement();
			
		//	System.out.println("connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	//	ConFile c=new ConFile();
		
	}

}
