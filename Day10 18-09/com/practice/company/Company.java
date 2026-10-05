package com.practice.company;
import com.practice.employee.Employee;

 class Company
{
	 public static void main(String args[]) {
        System.out.println("Company Info Started");
        Employee emp = new Employee();

        emp.name = "Chandan Kumar";
        emp.salary = 400000;

        emp.displayEmployee();
		
		System.out.println("Company Info End");
    }




}