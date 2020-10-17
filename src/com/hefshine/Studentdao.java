package com.hefshine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdao {
	
	String url="jdbc:mysql://localhost:3306/santu";
	String username="root";
	String password="Santu@956";
	
	void fetch()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from student");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getInt(4)+" "+rs.getString(5));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		void saveRecorder()
		{
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement("insert into student values(?,?,?,?,?)");
		st.setString(1, "nakul");
		st.setString(2, "aadi");
		st.setString(3,"pkdh");	
		st.setInt(4, 35);
		st.setString(5, "IISC");
		//execute query
		@SuppressWarnings("unused")
		int executeUpdate = st.executeUpdate();
		System.out.println("data inserted");
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
		@SuppressWarnings("unused")
		void deleteRecord()
		{
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement("delete from student where firstname=?");
				st.setString(1,"santu");
				int executeUpdate = st.executeUpdate();
				System.out.println("data DELETED");
				con.close();
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		@SuppressWarnings("unused")
		void updateRecorder()
		{
			{try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement("update student set firstname=? ,lastname=? where age=?");
				
				st.setString(1,"pritam");
				st.setString(2, "sinha");
				st.setInt(3,24);
				int executeUpdate=st.executeUpdate();
				System.out.println("new data updaTED");
				con.close();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		}}
	
	
	

