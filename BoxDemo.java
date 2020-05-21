package com.chak.learnJava;

class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    // compute and return volume
    double volume2(){
        return width * height * depth;
    }

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // This is the constructor for Box
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}



class BoxDemo {

    public static void main(String[] args) {
//        System.out.println("Hello, Java 14 OpenJDK");
        Box mybox = new Box(0,0,0);
        double vol;

        // assign values to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // compute volume of mybox
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume of mybox is "+ vol);
    }


}
