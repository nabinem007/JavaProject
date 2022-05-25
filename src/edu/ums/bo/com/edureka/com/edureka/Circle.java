package edu.ums.bo.com.edureka.com.edureka;

public class Circle extends Shapes{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.drawShape();
        c.colorShape();
        c.moveShape();

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
