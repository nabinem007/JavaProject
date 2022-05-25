package edu.ums.bo.com.edureka.com.edureka;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.login(5,"nabin");

    }

    public void login(String s, String p){
        System.out.println("Login successful using username and password");

    }

    public void login(int s, String p){
        System.out.println("Login successful phome number and password");




    }

}
