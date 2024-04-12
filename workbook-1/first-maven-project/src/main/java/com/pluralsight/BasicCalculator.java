package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    //This is for the first number
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        Scanner scan = new Scanner(System.in);
        float t= scan.nextFloat();

        //This is for the second number
        System.out.print("Enter second number:");
        float num2 =scan.nextFloat();

        //Operation to be performed by the user
        System.out.print("Possible calculations: (A)dd (S)ubtract (M)ultiply (D)ivide \n Please select an option:");
        String op=scan.next();

        //Perform the Operation
        float result = 0.0f;
        if(op.equals("M")) {result = t * num2;}
        else if (op.equals("A")){result = t + num2;}
        else if (op.equals("S")){result =t -num2;}
        else if (op.equals("D")){result = t /num2;}

        //Displaying the result
        System.out.printf("Your numbers added together is %.2f", result);



    }
}
