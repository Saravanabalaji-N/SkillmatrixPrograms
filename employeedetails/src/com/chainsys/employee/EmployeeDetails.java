package com.chainsys.employee;

import java.util.Arrays;

import java.util.Scanner;

import com.chainsys.employee.Company;
import com.chainsys.employee.Employee;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter company name :");
        String companyName=sc.nextLine();
        System.out.println("number of employees");
        int size=sc.nextInt();
        Employee1[] employees1= new Employee1[size];
        System.out.println("Enter employee details:");
        for(int i=0;i<size;i++) {
            System.out.println("Employee "+(i+1));
        
            System.out.println("Enter employee id:");
            int id=sc.nextInt();
            System.out.println("Enter name:");
            String name=sc.next();
            System.out.println("Enter designation:");
            String designation=sc.next();
            System.out.println("Enter salary");
            double salary=sc.nextDouble();
             
            employees1[i]=new Employee1(id,name,designation,salary);
        }
       Company company=new Company(companyName,employees1,size);
       System.out.println("Average Salary "+ company.getAverageSalary(employees1));
       System.out.println("Max Salary "+company.getMaxSalary(employees1));
       System.out.println("Designation: Engineer\n"+Arrays.toString(company.getEmployeesByDesignation("Engineer", employees)));
    
        
        

    }

}
