package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt input name
        System.out.print("Enter your name");
        String name = new
        Scanner (System.in).next();

        //Prompt entry of hours worked
        System.out.print("How many hours did you work");
        float hours = new
                Scanner(System.in).nextFloat();

        //prompt user to input pay rate
        System.out.print("Enter your pay rate:");
        float payRate = new
                Scanner(System.in).nextFloat();

        //Gross pay calculation
        float grosspay = hours * payRate;

        //Display results
        System.out.println("Your name: " + name);
        System.out.println("Your gross pay: $" + grosspay);



    }
}
