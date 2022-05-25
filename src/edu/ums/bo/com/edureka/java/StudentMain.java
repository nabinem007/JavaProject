package edu.ums.bo.com.edureka.java;

import java.util.Scanner;

public class StudentMain {
    //data members
    private static int studID;
    private static String studName;
    private static double fees ;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter Student ID : ");
        studID = sc.nextInt();

        System.out.println("Enter Student Name : ");
        studName = sc.next();

        System.out.println("Enter Student Fees : ");
        fees = sc.nextDouble();

        // set student details into Student object
        Student stud = new Student();



    }
}
