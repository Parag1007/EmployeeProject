package com.dao;

import java.util.Scanner;

import com.entity.Employee;

public class EmployeeDao {
	Employee db;

	public Employee[] Empdetails() {

		Employee[] db = new Employee[10];
		db[0] = new Employee(10, "Amit", "developer", 500000);
		db[1] = new Employee(2, "Priya", "Tester", 600000);
		db[2] = new Employee(9, "Ravi", "CEO", 550000);
		db[3] = new Employee(4, "Sanya", "manager", 700000);
		db[4] = new Employee(3, "Vikram", "developer", 650000);
		db[5] = new Employee(5, "Neha", "tester", 500000);
		db[6] = new Employee(8, "Rajesh", "developer", 520000);
		db[7] = new Employee(7, "Sneha", "Tester", 750000);
		db[8] = new Employee(6, "Arjun", "developer", 480000);
		db[9] = new Employee(1, "Anjali", "Developer", 620000);

		return db;

	}
	/*
	 * public void EmployeeManagement() {
	 * 
	 * Scanner sc = new Scanner(System.in); int ch;
	 * 
	 * do { System.out.println("*******EMPLOYEE DETAILS*******");
	 * System.out.println("1.show Emplyee details:");
	 * System.out.println("2.Show Employee by id: ");
	 * System.out.println("3.Show Employee by role: ");
	 * System.out.println("4.Find the maximum salary Employee");
	 * System.out.println("5.Find the minimum salary Employee");
	 * System.out.println("6.Sort Employee assending order:");
	 * System.out.println("7.Sort Employee Desending order:");
	 * System.out.println("8.Exit....."); ch = sc.nextInt(); switch (ch) { case 1:
	 * Empdetails(); break; case 2: showEmpbyId(ch); break; case 3:
	 * showEmpRole(null); break; case 4: maxSalEmployee(sc); break; case 5:
	 * minSalEmployee(); break; case 6: sortEmpAssending(); break; case 7:
	 * sortEmpDescending(); case 8: System.out.println("Exit...."); break; default:
	 * System.out.println("invalid choice enter the num between 1 to 8");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * while (ch != 7); sc.close();
	 * 
	 * }
	 */

	public Employee[] showAllEmployee() {

		Employee[] emp = Empdetails();
		return emp;
	}

	public void showEmpRole(String role) {

		Employee[] emp = Empdetails();
		for (Employee e : emp) {
			if (e.getRole().equalsIgnoreCase(role)) {
				System.out.println(e);
			}

		}

	}

	public Employee maxSalEmployee(Scanner sc) {
		Employee[] emp = Empdetails();

		Employee empMaxSal = emp[0];
		for (Employee employee : emp) {

			if (employee.getSalary() > empMaxSal.getSalary()) {

				empMaxSal = employee;
			}
		}

		return empMaxSal;

	}

	public Employee minSalEmployee() {
		Employee[] emp = Empdetails();

		Employee empMinSal = emp[0];
		for (Employee employee : emp) {

			if (employee.getSalary() < empMinSal.getSalary()) {

				empMinSal = employee;
			}
		}

		return empMinSal;

	}

	public Employee showEmpbyId(int id) {
		Employee[] emp = Empdetails();

		int index = id - 1;

		return emp[index];

	}

	public Employee[] sortEmpAssending() {

		Employee[] emp = Empdetails();
		int n = emp.length;
		for (int i = 0; i < n - 1; i++) {// this outer loop for pass the value
			for (int j = 0; j < n - 1 - i; j++) {// this inner loop for comparision

				if (emp[j].getEmpid() > emp[j + 1].getEmpid()) {// if condition for compair elements
					// swap here emp[j] and emp[j+1]
					Employee temp = emp[j];// tore emp[j] in temp variable
					emp[j] = emp[j + 1];// here move emp[j+1] position to position j
					emp[j + 1] = temp;// here move temp means emp[j] to position j+1

				}

			}

		}
		return emp;

	}

	public Employee[] sortEmpDescending() {
		Employee[] emp = Empdetails();
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = 0; j < emp.length - 1 - i; j++) {
				if (emp[j].getEmpid() < emp[j + 1].getEmpid()) {

					Employee temp = emp[j];
					emp[j] = emp[j + 1];
					emp[j + 1] = temp;

				}

			}

		}
		return emp;

	}

}
