package edu.ums.bo.com.edureka;

import java.util.Scanner;

public class MethodDemo {
    //data members
    private static int a ;
    private static int b;
    private static int sum ;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {  // calling from main method
        System.out.println("Enter the a value..");
        a = sc.nextInt();
        System.out.println("Enter the b value..");
        b = sc.nextInt();
        // invoke the add method
        add();
    }

    //user defined method
    public static void add(){ //<.. called a method
        // calculate the sum
        sum = a+b;
        System.out.println("The Sum of a and b is "+sum);
    }

}
