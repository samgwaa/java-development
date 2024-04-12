package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        int day;
        String dayInWords;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our car rental site.");
        System.out.print("When do you want to come pickup the car/date (yyyy-MM-DD):");
        String pickupDate = scanner.next();
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        //Prompt user for number of days they want to rent the car
        System.out.print("Enter number of days for rental:");
        int  rentalDays = scanner.nextInt();

        //Request user if they want electric toll tag
        System.out.print("Do you want an electric toll tag?(yes/no):");
        String tollTagReply =
                scanner.next();
        boolean wantsTollTag= tollTagReply.equalsIgnoreCase("yes");

        //Request user if they want GPS
        System.out.print("Do you want GPS?(yes/no):");
        String GPS =
                scanner.next();
        boolean wantsGPS= GPS.equalsIgnoreCase("yes");

        //request user if they want roadside Assistance
        System.out.print("Do you want roadsideAssistance?(yes/no):");
        String roadsideAssistance=
                scanner.next();
        boolean wantsRoadsideAssistance= roadsideAssistance.equalsIgnoreCase("yes");

        //Car Rental cost
        double basicRentalCost = rentalDays * 29.99;

        // Checking if the user wants an electric toll tag, GPS, or roadside assistance

        double optionCost =0.0;
        if (wantsTollTag) {
            optionCost += 3.95;
        }
        if (wantsGPS) {
            optionCost += 2.95;
        }
        if (wantsRoadsideAssistance) {
            optionCost += 3.95;
        }
        //Underage surcharge
        double surcharge =0.0;
        if (age <25) {
            surcharge = basicRentalCost *0.3;

            //Total cost by adding all costs
            double totalCost = basicRentalCost + optionCost + surcharge;

            //Displaying Results to user
            System.out.println("Basic car rental cost:$ "+ optionCost);
            System.out.println("Option Cost: $" +optionCost);
            System.out.println("Underage driver surcharge: $" + surcharge);
            System.out.println("Total cost: $" + totalCost);
        }
    }

}
