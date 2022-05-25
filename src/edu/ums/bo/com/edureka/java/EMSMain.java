package edu.ums.bo.com.edureka.java;

import edu.ums.bo.com.edureka.com.edureka.UserVO;

import java.util.Scanner;

public class EMSMain {
    //data members
    private static String username;
    private static String password;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //read login credentials
        System.out.println("Enter username");
        username = sc.next();
        System.out.println("Enter password");
        password = sc.next();

        //set username and password into UserVO object
        UserVO userVO = new UserVO();

        userVO.setUserName(username);
        userVO.setPassword(password);

        // pass this Uservo object to validate User method given in the page



    }
}