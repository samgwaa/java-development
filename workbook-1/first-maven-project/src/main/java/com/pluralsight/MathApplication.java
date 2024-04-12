package com.pluralsight;

public class MathApplication {
    public static void main(String[] args) {
   // Question 1:
        //Code Solution
   int BobSalary = 100000;
   int GarySalary = 80000;
  int HighestSalary = Math.max(BobSalary,GarySalary);
  //Display of results
  System.out.println("HighestSalary:" + HighestSalary);

  //Second Question, Code solution
        float carPrice = 26852;
        float truckPrice = 48000;
        float smallestPrice = Math.max(carPrice, truckPrice);
        //Display of Result
        System.out.println("smallestPrice:" + smallestPrice);

        //Question 3
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("area of circle:"+area);

        //Question 4
        double Sq =5.0;
       double sq=Math.sqrt(Sq);
       //display result
       System.out.println(sq);

       //Question 5, find and display of distance
        int x1 =5;
        int x2 =85;
        int y1 =10;
        int y2 =50;
        double distance;
        int xm = x2-x1;
        int ym = y2-y1;

        distance = Math.sqrt(Math.pow(xm, 2) + Math.pow(ym, 2));
        System.out.println("Distance:" + distance);

        //Question 6
        double value =-3.8;
        double absValue = Math.abs(value);
        System.out.println("Ansolute value:" + absValue);

        //Question 7
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1:" + randomNumber);




    }
}
