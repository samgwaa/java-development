package com.pluralsight;

import java.util.Scanner;
public class SandwichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt user for sandwich size
        System.out.print("What size  do you want? (Regular $5.45, Large $8.95):");
        String size = scanner.nextLine();

        //Calculate base price per the sizes
        double basePrice = 0.0;
        if (size.equals("Regular")) {
            basePrice = 5.45;
        } else if (size.equals("Large")) {
            basePrice = 8.95;
        }
        //Prompt user for age
        System.out.print("What is your age?(Student(17 or younger) or senior (65 or older)):");
        int age = scanner.nextInt();

        //Calculating discount base on their ages
        double discount;
        if (age <= 17 || age >= 65) {
            discount = 0.01;// % discount for students
        } else {
            discount = 0.02; //% discount for seniors

            //Calculation of final price
            double cost = (basePrice * discount);}

            //Modification from here
            System.out.print("Would you like a loaded sandwich(yes/no)?");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes"))
                //Add additional cost for loaded sandwich
                if (size.equals("Regular")) {
                    basePrice += 1.00;
                } else if (size.equals("Large")) {
                    basePrice += 1.75;
                }

            //Displayed result
            System.out.println("Your sandwich cost $" + basePrice);

    }
    }

