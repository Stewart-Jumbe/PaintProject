package com.softwareinstitute.sjumbe;

import java.util.Scanner;

public class HardCodedPaintMain {

    public static float mmToMConversion(float mmValue){
        float mValue = mmValue/1000;
        return mValue;
    }

    public static String addSpaceBetweenPrints(){
        return " ";
    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String customerResponse = "yes";//initalising it for use in the while loop


        do {
            //calculations to work out the amount of paint needed to paint a room

        int paintPotAreaCoverage = 10; // m2
        float costOfPaintPotinGBP = 5.76f;
        int timeToPaintARoomInHrs = 4;
        int budgetInGBP = 10000;

        System.out.println("Hello, what is your name: ");
        String customerName = userInput.nextLine();
        addSpaceBetweenPrints();

        System.out.println("Jim, What's your hourly rate: ");
        int hourlyRateInGBP = Integer.parseInt(userInput.nextLine());

            //Example of switch case
            String message;
            switch (hourlyRateInGBP) {
                case 70:
                    message = customerName +":" +" Ohh, Great price";
                    break;

                case 20, 30, 40, 50, 60, 65:
                    message = customerName +":" +" (think to self) Amazing  price...too good to be true?!";
                    break;

                case 75:
                    message = customerName +":" +" Getting pricey";
                    break;
                case 80, 85, 90, 95, 100:
                    message = customerName +":" +" I need to change career";
                    break;
                default:
                    message = customerName +":" +" That's so low";
                    break;

            }

          addSpaceBetweenPrints();
            System.out.println(message); // from Switch case

        //hourlyRateInGBPInput.close();
        String[] paintColours = {"Brown", "Grey", "Blue", "Green"};


                System.out.println(customerName +","+ " Which paint colours would you like use I've got the following: ");
                for (int i = 0; i < paintColours.length; i++) {

                    if (i != (paintColours.length - 1)) {

                        System.out.print(paintColours[i] + " and ");
                    } else {
                        System.out.print(paintColours[i]);
                    }

                }


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter your colour: ");
        String customersChosenColour = userInput.nextLine();



            //int numberOfRoomsInTheHouse = (int)(Math.random()*10) ; //maximum number of rooms will be 9
            int numberOfRoomsInTheHouse = (int) (Math.random() * 100); //maximum number of rooms will be 99

            System.out.println("The number of rooms is : " + numberOfRoomsInTheHouse);
            System.out.println("Please enter your average room height in mm : ");
            //***SCANNER***
            float heightOfRoomWallInMM =Float.parseFloat(userInput.nextLine());
            float heightOfRoomWallInMeters =mmToMConversion(heightOfRoomWallInMM) ;

            System.out.println("Please enter your average room length in mm : ");
            //***SCANNER***
            float lengthOfRoomWallsInMM = Float.parseFloat(userInput.nextLine());
            float lengthOfRoomWallInMeters = mmToMConversion(lengthOfRoomWallsInMM);

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


            //System.out.println("The amount of paint you need is: " + numberOfPaintPotsNeeded);
            System.out.println("");//blank line
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("I'll need: " + numberOfPaintPotsNeededRoundedUp + "paint pots for this job");
            System.out.println("");//blank line
            System.out.println("The cost of the paint alone to do your " + numberOfRoomsInTheHouse + " room house is " + "£" + totalCostOfPaintInGBP);
            System.out.println("");//blank line
            System.out.println("My labour cost for this job will be " + "£" + myLabourCostInGBP);
            System.out.println("");//blank line
            System.out.println("So the total \"cost\" of this job will be " + "£" + totalCostOfPaintingInGBP);
            System.out.println("-----------------------------------------------------------------------------");

            if (totalCostOfPaintInGBP > budgetInGBP) {
                System.out.println("");//blank line
                System.out.println("This is madness, I cant afford that");
            } else if (totalCostOfPaintInGBP < 5000) {
                System.out.println("");//blank line
                System.out.println("Great price, when can you start Jim");
            } else {
                System.out.println("I cant believe its that cheap");

            }


            Scanner customerInputForAdditionalWork = new Scanner(System.in);
            System.out.println("Did you like the quality of my work");
            customerResponse = userInput.nextLine();


            } while (customerResponse.contains("y"));// if user enters do section will be executed again
            System.out.println("Sorry about that, Could you please leave a more detailed review");



        }
    }

