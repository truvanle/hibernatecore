package com.hibernate.tutorial;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public int getSalary() {
		return salary;
	}
}
