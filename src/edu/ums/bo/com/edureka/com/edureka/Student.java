package edu.ums.bo.com.edureka.com.edureka;

import java.util.Scanner;

public class Student {
    //data members

    private static int studID;
    private static String studName;
    private static String course;
    private static double sub1;
    private static double sub2;
    private static double sub3;
    private static double total;
    private static double average ;
    private static String result;

    public static void setStudentDetails(){
        Scanner sc = new Scanner(System.in);
        // read data from console

        System.out.println("Enter Student ID");
        studID = sc.nextInt();

        System.out.println("Enter Student Name");
        studName = sc.next();

        System.out.println("Enter Course");
        course = sc.next();

        System.out.println("Sub1 marks:");
        sub1 = sc.nextDouble();

        System.out.println("Sub2 marks");
        sub2 = sc.nextDouble();

        System.out.println("Sub3 marks");
        sub3 = sc.nextDouble();
    }

        //method to calculate totol and average
    public static void calculateTotalAvg(){
        //calculate the total
        total = sub1+sub2+sub3;
        //calculate Average of marks
        average = total/3;

    }

    //find student result
    public static void findResult(){
        // set the result value based on average of marks
        if (average>=70){
            result = "Distinction";
        }
        else if (average>=60){
            result = "First Class";
        }
        else if (average>=50){
            result = "Second Class";
        }
        else if (average>=50){
            result = "Third Class";
        }
        else {
            result = "Fail";
        }
    }
    private static void showStudentDetails(){
        System.out.println("Student ID "+studID);

        System.out.println("Student Name "+studName);

        System.out.println("Course is "+course);

        System.out.println("The Result is "+result);
    }

    public static void main(String[] args) {
        //invoke all the methods
        setStudentDetails();
        calculateTotalAvg();
        findResult();
        showStudentDetails();

    }

}
