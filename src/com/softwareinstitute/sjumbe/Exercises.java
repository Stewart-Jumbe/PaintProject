package com.softwareinstitute.sjumbe;

public class Exercises {


    public static void main(String[] args) {
        //Exercise
        //find highest and lowest value of x and y

        int y = (int) (Math.random() * 101); // will output a number 0 to 100
        int x = (int) (Math.random() * 100); // will output a number 0 to 99
        int maxValue = Math.max(x, y);
        int minValue = Math.min(x, y);

        System.out.println("value of y is " + y);
        System.out.println("value of x is " + x);

        System.out.println("The higherst is " + maxValue);
        System.out.println("The lowest value is " + minValue);
    }
}
