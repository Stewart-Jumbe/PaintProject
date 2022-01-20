package com.softwareinstitute.sjumbe;

import java.util.Scanner;

public class Main {

    private static String myName = "Stewart"; // this needed to be outside of the main method

    public static void main (String[] args) {


    int firstNumber = 20;
    int secondNumber = 10;
    float myFloat = 12.7f;
    char myChar = 'S';


//    System.out.println("Hello World!" + " my name is " + myName + "my char is " + myChar);
//    System.out.print(firstNumber + secondNumber);
//    System.out.println("having the ++ before the num " + ++firstNumber); // adds 1 to the number
//    System.out.println(firstNumber++);
//    System.out.println(firstNumber);

    //calculations to work out the amount of paint needed to paint a room
        int paintPotAreaCoverage = 10; // m2

        float costOfPaintPotinGBP = 5.76f;
        int timeToPaintARoomInHrs = 4;

        Scanner hourlyRateInGBPInput = new Scanner(System.in);
        System.out.println("What's your hourly rate: ");
        int hourlyRateInGBP = Integer.parseInt(hourlyRateInGBPInput.nextLine());

        String message;
        switch (hourlyRateInGBP){
            case 70:
                message = "Sound";
                break;

            case 75:
                message = "Getting pricey";
                break;
            case 80,85,90,95,100:
                message = "I need to change career";
                break;
            default:
                message = "That so low, or thats so high";
                break;

        }

        System.out.println(message);


        //int numberOfRoomsInTheHouse = (int)(Math.random()*10) ; //maximum number of rooms will be 9
        int numberOfRoomsInTheHouse = (int)(Math.random()*100) ; //maximum number of rooms will be 99

        System.out.println("The number of rooms is : "+ numberOfRoomsInTheHouse);

        Scanner heigtOfRoomWallInMetersInput = new Scanner(System.in);
        System.out.println("Please enter your room height: ");
        float heightOfRoomWallInMeters = Float.parseFloat(heigtOfRoomWallInMetersInput.nextLine());




        float lengthOfRoomWallInMeters = 4f ;
        float numberOfWallsInRoom = 4f;
        float areaOfWallInMetersSqr = heightOfRoomWallInMeters * lengthOfRoomWallInMeters ;
        float totalWallAreaInHouseInMetersSqr = areaOfWallInMetersSqr * numberOfWallsInRoom * numberOfRoomsInTheHouse;
        float numberOfPaintPotsNeeded =totalWallAreaInHouseInMetersSqr/paintPotAreaCoverage;

        String result = (heightOfRoomWallInMeters > 2.5f)? "I'll Need a Ladder" : "Don't need a lader"; //***turnery***
        System.out.println(result);
        //Rounded up
        //need to round up number of PaintPots needed, so we'll just convert the final result to an int and add 1 to it
        //int numberOfPaintPotsNeededRoundedUp = (int) numberOfPaintPotsNeeded;
        //numberOfPaintPotsNeededRoundedUp++;

        // rounding up using ceil function
        int numberOfPaintPotsNeededRoundedUp = (int)Math.ceil(numberOfPaintPotsNeeded);

        //Calculating cost of paint
        float totalCostOfPaintInGBP = numberOfPaintPotsNeededRoundedUp * costOfPaintPotinGBP;

        //calculating labour cost
        float myLabourCostInGBP = timeToPaintARoomInHrs * numberOfRoomsInTheHouse *hourlyRateInGBP;

        //caculating total cost of job
        float totalCostOfPaintingInGBP = totalCostOfPaintInGBP + myLabourCostInGBP;

        //customer info
        int budgetInGBP = 10000;

        if (totalCostOfPaintInGBP > budgetInGBP){
            System.out.println("");//blank line
            System.out.println("This is madness, I cant afford that");
        }else if (totalCostOfPaintInGBP < 5000){
            System.out.println("");//blank line
            System.out.println("When can you start JIM");
        }else {System.out.println("I cant believe its that cheap");

        }


        //System.out.println("The amount of paint you need is: " + numberOfPaintPotsNeeded);
        System.out.println("");//blank line
        System.out.println("I'll need: " + numberOfPaintPotsNeededRoundedUp + "paint pots for this job");
        System.out.println("");//blank line
        System.out.println("The cost of the paint alone to do your " +numberOfRoomsInTheHouse + " room house is " + "£"+totalCostOfPaintInGBP );
        System.out.println("");//blank line
        System.out.println("My labour cost for this job will be "+"£"+myLabourCostInGBP);
        System.out.println("");//blank line
        System.out.println("So the total \"cost\" of this job will be "+"£" + totalCostOfPaintingInGBP );

        System.out.println("");
        //Normal version
        double myRandomNum = Math.random();

        System.out.println("My random number is " + myRandomNum);
        System.out.println("");

        int switchNumber = 10;





}

}