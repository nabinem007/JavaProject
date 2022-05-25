package edu.ums.bo.com.edureka.bo;

public class ClassA {
    // data members
    //private
    private static int a = 10;
    //public
    public static int b = 20;
    //protected
    protected static int c = 30;
    //default
    static int d =40;

    public static void main(String[] args) {
        //access private member
        System.out.println("The private member in the same class in "+a);
        System.out.println("The public member in the same class in "+b);
        System.out.println("The protected member in the same class in "+c);
        System.out.println("The default member in the same class in "+d);

    }



}
