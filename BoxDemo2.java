package com.chak.learnJava;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(0,0,0);
        Box mybox2 = new Box(0,0,0);

        double vol;

        // assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign values to mybox1's instance variables
        mybox2.width = 5;
        mybox2.height = 10;
        mybox2.depth = 8;

        // compute volume of mybox1
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume of 1st Box is "+ vol);

        // compute volume of mybox2
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume of 2nd Box is "+ vol);
    }
}
