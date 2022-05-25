package edu.ums.bo.com.edureka.com.edureka;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat ct = new Cat();
        ct.makeNoise();


    }

    public void makeNoise(){
        System.out.println("Cat meows");
    }
}
