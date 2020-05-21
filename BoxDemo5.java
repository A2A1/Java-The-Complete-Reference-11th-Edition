package com.chak.learnJava;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box(0,0,0);
        Box mybox2 = new Box(0,0,0);

        double vol;

        // initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(5, 10, 8);

        // get volume of mybox1
        vol = mybox1.volume2();
        System.out.println("Volume 1st Box is " + vol);

        // get volume of mybox2
        vol = mybox2.volume2();
        System.out.println("Volume 2nd Box is " + vol);

    }
}
