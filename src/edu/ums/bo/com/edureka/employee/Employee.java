package edu.ums.bo.com.edureka.employee;

import java.util.Scanner;

public class Employee {

    // data members
    private int empID;
    private String empName ;
    private double salary;

    // method to set employee data
    public void setEmpDetails(){
        Scanner sc = new Scanner(System.in);
        //read employee details
        System.out.println("Enter Employee ID: ");
        empID = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        empName = sc.next();
        System.out.println("Enter Employee Salary");
        salary = sc.nextDouble();
    }

    //display employee details
    public void showEmpDetails(){
        System.out.println("Employee details are as follws.....");
        System.out.println("Employee ID :"+empID);
        System.out.println("Employee Name :"+empName);
        System.out.println("Employee Salary: "+salary);
    }
}

