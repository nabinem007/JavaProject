package edu.ums.bo.com.edureka.com.edureka;

public class MethodsDemo {

    public static void main(String[] args){

        addNumbers(20,50);
        parameters("Nabin",10,20.45);

    }
    public static void dologin()
    {
        System.out.println("Login Successful");

    }

   public static int addNumbers(int x,int y)
   {
        int z = x+y;
        System.out.println("The Sum of two variables " +z);
        return z;

   }

   public static void parameters(String S,int X,double Y)
   {
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
   }
}
