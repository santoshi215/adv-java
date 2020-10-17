package com.hefshine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {

	String url = "jdbc:mysql://localhost:3306/demo";
	String username = "root";
	String password = "Santu@956";

	void fetch()
	{
		try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from employee");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	void saveRecorder(Employee emp) {
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?)");
		st.setInt(1,emp.getregNo());
		st.setString(2, emp.getFirstName());
		st.setString(3, emp.getLastName());	
		//execute query
		@SuppressWarnings("unused")
		int executeUpdate = st.executeUpdate();
		System.out.println("data updated");
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	@SuppressWarnings("unused")
	public void deleteRecorder()
	{
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement("delete from employee where regno=?");
		st.setInt(1, 250);
		int executeUpdate = st.executeUpdate();
		System.out.println("data DELETED");
		con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@SuppressWarnings("unused")
		public void updateRecorder()
		{try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement("update employee set fname=? ,lname=? where regno=?");
			
			st.setString(1,"xyz");
			st.setString(2, "aba");
			st.setInt(3,1);
			int executeUpdate=st.executeUpdate();
			System.out.println("data updaTED");
			con.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			} 
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
}
