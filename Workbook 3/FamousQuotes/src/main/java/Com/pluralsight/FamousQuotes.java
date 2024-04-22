package Com.pluralsight;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = new String[]{//Quotes stated below
           "Stay steady no matter how unsteady the situation might be", "The work that hurts you less than it hurts others is the work you were made to do",
                "The first mistake is never the one that ruins you","Some people spend their entire life waiting for the time to be right to make an improvement",
                "Whenever you want to change your behaviour you can simply ask your self, the how can i questions",
                "Be the designer of your world and not merely the consumer of it",
                "Habits are the compound interest of self-improvement",
                "Goals are good for setting a direction, but systems are best for making progress",
                "Grit plus Grace is a mastery turnaround for success",
                "Trust in the lord your God  with all your heart, and do not lean on your own understanding"
        };
        Scanner scanner = new Scanner(System.in);//scanner created for user input
        boolean repeat = true;// initialize a boolean variable to control the loop

            while (repeat){//
                System.out.println("Select a quote (1-10), 0r 15 for a random quote:");
                int selection = scanner.nextInt();

                if (selection==15){
                    int randomIndex =(int) (Math.random()* quotes.length);
                    System.out.println(quotes[randomIndex]);
                } else if (selection >= 1 && selection <= 10){
                    System.out.println(quotes[selection -1]);
                }else {
                    System.out.println("Invalid selection. Please try again.");//Display error message
                } catch (InputMismatchException){
                    System.out.println("Invalid input.Please enter a number.");
                    scanner.next(); //Discard the invalid input
                }
                System.out.println("See another quote? (yes/no");// Ask the user if they want to see another quote
                String response = scanner.next();// read user's response
                repeat = response.equalsIgnoreCase("yes");//set repeat to true if the user entered "yes"

            }

    }

}
