package edu.ums.bo.com.edureka.com.edureka;

public class Sum {
    public static void main(String[] args){
        int a =10;
        int b = 6;
        int c = add(a,b);
        int d = sub(a,b);
        System.out.println("The Sum of a and b is "+c);
        System.out.println("The subtraction of a and b is "+d);
    }

    public static int add(int x, int y){
        int z =x+y;
        return z;
    }

    public static int sub(int x,int y){
        int z = x-y;
        return z;
    }
}


