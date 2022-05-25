package edu.ums.bo.com.edureka.java;

import java.util.Scanner;

public class Employee1 {
    // data members
    private int empID;
    private String empName;
    private double salary ;

    // set constructor
    public Employee1(){
        Scanner sc = new Scanner(System.in);
        // read employee details
        System.out.println("Enter Employee ID : ");
        empID = sc.nextInt();
        System.out.println("Enter Employee Name : ");
        empName = sc.next();
        System.out.println("Enter Employee salary : ");
        salary = sc.nextDouble();
    }
}
