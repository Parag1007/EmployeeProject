package com.entity;

public class Employee {
	
	int empid;
	String name;
	String role;
	int salary;
	public Employee() {
		super();
	}
	public Employee(int empid, String name, String role, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
	

}
