package com.chainsys.model;

import java.util.Scanner;


public class Myclass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("number of employees");
		int size = sc.nextInt();
		Employee[] employees = new Employee[size];
		for (int i = 0; i < employees.length; i++) {
			System.out.println("eneter Id:");
			int id = sc.nextInt();
			System.out.println("eneter name:");
			String name = sc.next();
			System.out.println("enter brach:");
			String branch = sc.next();
			System.out.println("enter rating:");
			double rating = sc.nextDouble();
			System.out.println("enter using companyTransport :");
			boolean companyTransport = sc.nextBoolean();

			employees[i]= new Employee(id, name, branch, rating, companyTransport);

		}
		
		System.out.println("enter the branch :");
		String branches=sc.next();
		System.out.println(findCountOfEmployeesUsingCompTransport(employees,branches));
		Employee emp = findEmployeeWithSecondHighestRating(employees);
		System.out.println(emp.getName() + emp.getEmployeeId());
	}

	public static int findCountOfEmployeesUsingCompTransport(Employee[] employee,String branch) {
		
		int count = 0;
		for (int i = 0; i < employee.length;) {
			if (employee[i].isCompanyTransport() && employee[i].getBranch().equalsIgnoreCase(branch) ) {
				count++;
			}
			return count;
		}
		return 0;
	}

	public static Employee findEmployeeWithSecondHighestRating(Employee[] employee) {
		
		double temp=0;
		double first=0;
		double second=0;
		for (int i = 0; i < employee.length; i++) {
			for (int j = i+1; i < employee.length; j++)
			if(employee[i].isCompanyTransport()==false  ) {
				if(employee[i].getRating() < employee[j].getRating()) {
					
					Employee emp = employee[i];
					employee[i] = employee[j];
					employee[j] = emp;
				
				}
			}
		}
		
			return employee[employee.length - 2];
		
	}
}