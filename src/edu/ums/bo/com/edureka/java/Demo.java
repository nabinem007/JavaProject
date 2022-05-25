package edu.ums.bo.com.edureka.java;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter value of x");
        x = sc.nextInt();
        System.out.println("Enter value of y");
        y = sc.nextInt();
        add(x,y);

    }

    public static void add(int x ,int y)
    {
        int z =x+y;
        System.out.println("The sum of two numbers : "+z);


    }
}

