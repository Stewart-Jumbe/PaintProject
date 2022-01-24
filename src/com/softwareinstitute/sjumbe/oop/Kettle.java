package com.softwareinstitute.sjumbe.oop;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kettle {

    /////////////////////Attributes//////////////////////////
    private int currentVolume;
    private int maxVolume;
    private String colour;
    private int temperature;
    private LocalDateTime timeOfTemperature;



    /////////////////////Constructor//////////////////////////
    public Kettle(){
        currentVolume =0;
        maxVolume =1700; //ml
        colour = "white";
        temperature = 16;
        timeOfTemperature = LocalDateTime.now();
    }//default constructor


    /////////////////////Methods/////////////////////////////
    //return is useful if we want output a changed status
    public void boilKettle(){
        temperature = 100;
        timeOfTemperature = LocalDateTime.now();
    }

    public int getTemperature(){
        temperature=rateOfCooling();
        return temperature;
    }

    public int rateOfCooling(){
        Duration numberOfSeconds = Duration.between( timeOfTemperature,LocalDateTime.now());
        Long getSeconds = numberOfSeconds.getSeconds();
        int currentTemp = (int)(temperature -(getSeconds/10));
        if(currentTemp <16){
            currentTemp = 16;
        }
        timeOfTemperature = LocalDateTime.now();
        return currentTemp;

    }


    ////////////// To String


    @Override
    public String toString() {
        return "Kettle{" +
                "currentVolume=" + currentVolume +
                ", maxVolume=" + maxVolume +
                ", colour='" + colour + '\'' +
                ", temperature=" + temperature +
                ", timeOfTemperature=" + timeOfTemperature +
                '}';
    }
}
