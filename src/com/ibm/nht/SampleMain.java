package com.ibm.nht;

public class SampleMain {
	
	public static void main(String [] args) {
		Employee e = new Employee();
		e.setName("Mela");
		e.setRole("Trainee");
		e.setSalary(500);
		
		EmployeeForDatabase emploDao = new EmployeeForDatabase();
		emploDao.insert(e);
		emploDao.update(e);
		emploDao.update(e);
	}

}
