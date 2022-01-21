package com.softwareinstitute.sjumbe;

import java.util.Scanner;

public class HardCodedPaintMain {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String customerResponse = "yes";
        do {
            //calculations to work out the amount of paint needed to paint a room

        int paintPotAreaCoverage = 10; // m2
        float costOfPaintPotinGBP = 5.76f;
        int timeToPaintARoomInHrs = 4;
        int budgetInGBP = 10000;


        System.out.println("What's your hourly rate: ");
        int hourlyRateInGBP = Integer.parseInt(userInput.nextLine());

            //Example of switch case
            String message;
            switch (hourlyRateInGBP) {
                case 70:
                    message = "Ohh, Great price";
                    break;

                case 75:
                    message = "Getting pricey";
                    break;
                case 80, 85, 90, 95, 100:
                    message = "I need to change career";
                    break;
                default:
                    message = "That so low, or thats so high";
                    break;

            }

            System.out.println("");
            System.out.println(message); // from Switch case

        //hourlyRateInGBPInput.close();
        String[] paintColours = {"Brown", "Grey", "Blue", "Green"};

        System.out.println("Which paint colours would you like use I've got the following: ");
        for (int i = 0; i < paintColours.length; i++) {

            if(i!=(paintColours.length-1)){

                System.out.print(paintColours[i] + " and ");
            }else{
                System.out.print(paintColours[i]);}

            }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter your colour: ");
        String customersChosenColour = userInput.nextLine();




//        while(timeToPaintARoomInHrs >2){
//            timeToPaintARoomInHrs++;
//        }
//        System.out.println(timeToPaintARoomInHrs);



            //int numberOfRoomsInTheHouse = (int)(Math.random()*10) ; //maximum number of rooms will be 9
            int numberOfRoomsInTheHouse = (int) (Math.random() * 100); //maximum number of rooms will be 99

            System.out.println("The number of rooms is : " + numberOfRoomsInTheHouse);

            Scanner heigtOfRoomWallInMetersInput = new Scanner(System.in);
            System.out.println("Please enter your room height: ");
            float heightOfRoomWallInMeters = Float.parseFloat(heigtOfRoomWallInMetersInput.nextLine());


            float lengthOfRoomWallInMeters = 4f;
            float numberOfWallsInRoom = 4f;
            float areaOfWallInMetersSqr = heightOfRoomWallInMeters * lengthOfRoomWallInMeters;
            float totalWallAreaInHouseInMetersSqr = areaOfWallInMetersSqr * numberOfWallsInRoom * numberOfRoomsInTheHouse;
            float numberOfPaintPotsNeeded = totalWallAreaInHouseInMetersSqr / paintPotAreaCoverage;

            //
            String result = (heightOfRoomWallInMeters > 2.5f) ? "I'll Need a Ladder" : "Don't need a lader"; //***turnery***
            System.out.println(result);
            //Rounded up
            //need to round up number of PaintPots needed, so we'll just convert the final result to an int and add 1 to it
            //int numberOfPaintPotsNeededRoundedUp = (int) numberOfPaintPotsNeeded;
            //numberOfPaintPotsNeededRoundedUp++;

            // rounding up using ceil function
            int numberOfPaintPotsNeededRoundedUp = (int) Math.ceil(numberOfPaintPotsNeeded);
            float totalCostOfPaintInGBP = numberOfPaintPotsNeededRoundedUp * costOfPaintPotinGBP;
            float myLabourCostInGBP = timeToPaintARoomInHrs * numberOfRoomsInTheHouse * hourlyRateInGBP;
            float totalCostOfPaintingInGBP = totalCostOfPaintInGBP + myLabourCostInGBP;

            //customer info





            //System.out.println("The amount of paint you need is: " + numberOfPaintPotsNeeded);
            System.out.println("");//blank line
            System.out.println("I'll need: " + numberOfPaintPotsNeededRoundedUp + "paint pots for this job");
            System.out.println("");//blank line
            System.out.println("The cost of the paint alone to do your " + numberOfRoomsInTheHouse + " room house is " + "£" + totalCostOfPaintInGBP);
            System.out.println("");//blank line
            System.out.println("My labour cost for this job will be " + "£" + myLabourCostInGBP);
            System.out.println("");//blank line
            System.out.println("So the total \"cost\" of this job will be " + "£" + totalCostOfPaintingInGBP);

            if (totalCostOfPaintInGBP > budgetInGBP) {
                System.out.println("");//blank line
                System.out.println("This is madness, I cant afford that");
            } else if (totalCostOfPaintInGBP < 5000) {
                System.out.println("");//blank line
                System.out.println("When can you start JIM");
            } else {
                System.out.println("I cant believe its that cheap");

            }


            Scanner customerInputForAdditionalWork = new Scanner(System.in);
            System.out.println("Did you like the quality of my work");
            customerResponse = userInput.nextLine();


            } while (customerResponse.contains("y"));
            System.out.println("Wonderful I'm Hex, which house would you like me to do now?");



        }
    }

