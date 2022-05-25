package edu.ums.bo.com.edureka.bo;
import java.util.*;

public class Date {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println("Today's date "+dt);
        System.out.println("Day is "+dt.getDay());
        System.out.println("Year is "+dt.getYear());
        System.out.println("Date is "+dt.getDate());

        // create a string
        String str = new String("hello");
        if (str.equals("hello")){
            System.out.println("String is matching..");
        }
        else {
            System.out.println("String is not matching..");
        }
    }



}
