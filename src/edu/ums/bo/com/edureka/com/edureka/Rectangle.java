package edu.ums.bo.com.edureka.com.edureka;

public class Rectangle extends Shapes{

    public static void main(String[] args) {
        Rectangle RC =new Rectangle();
        RC.colorShape();
        RC.drawShape();
        RC.colorShape();
    }
    @Override
    public void drawShape(){
        System.out.println("Drawing Cirle");
    }


    public void colorShape(){
        System.out.println("Coloring cirlce");
    }

    public void moveShape(){
        System.out.println("Moving Shapre");
    }


}
