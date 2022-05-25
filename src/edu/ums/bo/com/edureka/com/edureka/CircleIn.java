package edu.ums.bo.com.edureka.com.edureka;

public class CircleIn implements Shapes1{
    public static void main(String[] args) {
        CircleIn CI = new CircleIn();
        CI.colorShape();

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
