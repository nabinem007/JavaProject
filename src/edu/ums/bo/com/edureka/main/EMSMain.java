package edu.ums.bo.com.edureka.main;

import java.util.Scanner;

public class EMSMain {
    // data members
    private static String userName ;
    private static String password;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // read login credentials
        System.out.println("Login as Admin...");
        System.out.println();
        System.out.println("Enter User Name : ");
        userName = sc.next();
        System.out.println("Enter Password : ");
        password = sc.next();


        LoginBO loginBO = new LoginBO();
        boolean result = loginBO.validateUser(userName,password);
        if (result){
            System.out.println("Successful login....");
        }
        else {
            System.out.println("Invalid Login! try again after some time ...");
        }


    }

}
