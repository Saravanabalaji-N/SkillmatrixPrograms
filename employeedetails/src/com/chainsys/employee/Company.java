package com.chainsys.employee;

import java.util.Arrays;

public class Company {
    private String companyName ;
    private Employee1[] employees ;
    private int numEmployees ;
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public Employee1[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee1[] employees) {
        this.employees = employees;
    }
    public int getNumEmployees() {
        return numEmployees;
    }
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }
    public double getAverageSalary(Employee1[] employees) {
        double averageSalary=0;
        for(int i=0;i<employees.length;i++) {
            averageSalary+=employees[i].getSalary();
        }
        return averageSalary/employees.length;
    }
    public Company(String companyName, Employee1[] employees, int numEmployees) {
        super();
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }
    public double getMaxSalary(Employee1[] employees) {
        double maxSalary=employees[0].getSalary();
        for(int i=1;i<employees.length;i++) {
            if(maxSalary<employees[i].getSalary()) {
                maxSalary=employees[i].getSalary();
            }
        }
        return maxSalary;
    }
    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", employees=" + Arrays.toString(employees) + ", numEmployees="
                + numEmployees + "]";
    }
    public Employee1[] getEmployeesByDesignation(String designation,Employee1[] employees) {
        Employee1[] employeesByDesignation= new Employee1[employees.length];
        int size=0;
        for(int i=0;i<employees.length;i++) {
            if(employees[i].getDesignation().equalsIgnoreCase(designation)) {
                employeesByDesignation[size++]=employees[i];
            }
        }
        return Arrays.copyOf(employeesByDesignation, size);
    }
}
