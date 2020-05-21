package com.chak.learnJava;

public class BoxDemo3 {
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
        mybox1.volume();

        // compute volume of mybox2
        mybox2.volume();
    }
}
