package com.softwareinstitute.sjumbe.oop;

public class Main {
    public static void main(String[] args){

        Kettle kettleObj = new Kettle();

        System.out.println(kettleObj);
        kettleObj.boilKettle();
        System.out.println(kettleObj);
        //kettleObj.wait(1000);
        System.out.println(kettleObj.rateOfCooling());
    }
}
