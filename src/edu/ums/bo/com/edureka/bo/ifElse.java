package edu.ums.bo.com.edureka.bo;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
         n = sc.nextInt();

         if (n%2!=0)
         {
             System.out.println("Weird");
         }
         else if (n>=2 && n<=5){
             System.out.println("Not Weird");
         }
         else if (n>=6 && n<=20){
             System.out.println("weird");
         }
         else {
             System.out.println("Not Weird");
         }


    }
}

