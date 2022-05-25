package edu.ums.bo.com.edureka.com.edureka;

import java.awt.geom.Area;

public class AreaofCircle {
    double pi=3.14;
    double r = 3.455;

    public static void main(String[] args) {
        AreaofCircle AC =new AreaofCircle();
        AC.Area(AC.pi, AC.r);
    }

    public void Area(double pi,double r) {

        double area = pi * (r * r);
        System.out.println("Area of Cirlce is :" + area);

    }
}


