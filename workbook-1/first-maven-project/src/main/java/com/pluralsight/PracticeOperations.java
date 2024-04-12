package com.pluralsight;

public class PracticeOperations {
  //Three string variables
  public static void main(String[] args) {

  } {
  String firstname ="Prince";
  String SecondName ="Emile";
  String lastname ="King";
  //Concatenation of strings
  String concatenatedstring = firstname + SecondName + lastname;
  //Three double variables
  double s1 = 10.0;
  double s2 = 2.0;
  double s3 = 3.0;
  //Operations with doubles
  double result = s1/s2 * s3;
  //Divide and concatenated results
    double dividedResult = s1/s2/s3;
    //Accumulative Results
  double accumulatedResult = dividedResult + 10 + 100 +1000;
  System.out.println("Concatenated string:" + concatenatedstring);
  System.out.println("Result of operations: + result");
  System.out.println("Divided result: "+ dividedResult);
  System.out.println("Accumulated result: " + accumulatedResult);
  }

}