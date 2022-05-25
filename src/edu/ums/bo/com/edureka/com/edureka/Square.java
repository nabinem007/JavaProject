package edu.ums.bo.com.edureka.com.edureka;

public class Square {
    public static void main(String[] args){
        int a=20;
        int b=20;
        int c = square(a,b);
        System.out.println("The square of a and b is "+c);

    }

    public static int square(int x,int y){
        int z;
        z= (x*x)+(2*x*y)+(y*y);
        return z;
    }
}
