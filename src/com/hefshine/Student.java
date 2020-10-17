package com.hefshine;

public class Student {

	private String fname;
	private String lname;
	private String email;
	private int age;
	private String branch;
	
	Student()
	{
		
	}
	Student(String fname,String lname,String email,int age,String branch)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.age=age;
		this.branch=branch;
	}
	public String getFname()
	{
		return fname;
	}
	public void setfName(String fname)
	{
		this.fname=fname;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLName(String lname)
	{
		this.lname=lname;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}

	
}
