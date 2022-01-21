package com.softwareinstitute.sjumbe;

import java.util.Scanner;

public class PaintCostCalculation {
    //class containing methods for calculating the cost of painting a house

    //Attributes

    //int paintPotAreaCoverage = 10; // m2
    //float costOfPaintPotInGBP = 5.76f;
    int timeToPaintARoomInHrs = 4;
    float hourlyRateInGBP = 75.50f;
    float heightOfRoomWallInMeters= 10f;
    float lengthOfRoomWallInMeters = 4f ;
    int numberOfRoomsInTheHouse = (int)((Math.random()*100) +1) ;
    float numberOfWallsInRoom = 4f;

    //blank constructor
    public PaintCostCalculation() {
    };


    //Scanner costOfPaintPotInGBPInput = new Scanner(System.in);
    //double costOfPaintPotInGBP = Double.parseDouble(costOfPaintPotInGBPInput.nextLine());



    //Method for calculating the amount of paint needed to paint a room.
    public  void calculatingNumberOfPaintPotsNeeded(){

        Scanner paintPotAreaCoverageInput = new Scanner(System.in);
        System.out.println("Please enter what area your paint covers in m2: ");
        int paintPotAreaCoverage = Integer.parseInt(paintPotAreaCoverageInput.nextLine()); //needed to parse string into int

        float areaOfWallInMetersSqr = heightOfRoomWallInMeters * lengthOfRoomWallInMeters ;

        float totalWallAreaInHouseInMetersSqr = areaOfWallInMetersSqr * numberOfWallsInRoom * numberOfRoomsInTheHouse;

        float numberOfPaintPotsNeeded =totalWallAreaInHouseInMetersSqr/paintPotAreaCoverage;
        System.out.print("The float value of the number of Paint Pots needd is: " +numberOfPaintPotsNeeded);
        int numberOfPaintPotsNeededRoundedUp = (int)Math.ceil(numberOfPaintPotsNeeded);
        System.out.println("The number of Paint Pots Needed is: " + numberOfPaintPotsNeededRoundedUp);

    }
}
