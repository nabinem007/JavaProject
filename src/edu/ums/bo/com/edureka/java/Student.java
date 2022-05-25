package edu.ums.bo.com.edureka.java;

import java.util.Scanner;

public class Student {
    //properties
    private static int studID;
    private static String studName;
    private static double fees ;

    public static int getStudID() {
        return studID;
    }

    public static void setStudID(int studID) {
        Student.studID = studID;
    }

    public static String getStudName() {
        return studName;
    }

    public static void setStudName(String studName) {
        Student.studName = studName;
    }

    public static double getFees() {
        return fees;
    }

    public static void setFees(double fees) {
        Student.fees = fees;
    }


}
