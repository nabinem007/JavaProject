package edu.ums.bo.com.edureka;

import java.util.Scanner;

public class Employee {
    // data members
    private int empID;
    private String empName ;
    private double salary ;

    // constructor to set employee data

    public Employee(){
        Scanner sc = new Scanner(System.in);
        //read employee details
        System.out.println("Enter Employee ID: ");
        empID = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        empName = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    public void Empdetails(){
        System.out.println("Employee details are as follows :");
        System.out.println(empID);
        System.out.println(empName);
        System.out.println(salary);
    }
}
