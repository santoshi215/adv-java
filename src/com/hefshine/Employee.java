package com.hefshine;

public class Employee {
	private int regno;private String fname;private String lname;
	public Employee()
	{
		
	}
	public Employee(int regno,String fname,String lname)
	{
		this.regno=regno;
		this.fname=fname;
		this.lname=lname;
	}
	
	public int getregNo()
	{
		return regno;
	}
	public void setregNo(int regno)
	{
		this.regno=regno;
	}
	public String getFirstName()
	{
		return fname;
	}
	public void setNmae(String  fname)
	{
		this.fname=fname;
	}
	public String getLastName()
	{
		return lname;
	}
	public void setLastName(String  lname)
	{
		this.lname=lname;
	}
}
