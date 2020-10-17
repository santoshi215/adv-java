package com.hefshine;

public class Employer {

	public static void main(String[] args) {
		EmployeeDao emp=new EmployeeDao();
		Employee empname=new Employee(1,"abb","niraj");
		
		//emp.fetch();
		emp.saveRecorder(empname);
		//emp.deleteRecorder();
		//emp.updateRecorder();
	}

}
