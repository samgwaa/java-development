// roll the dice
public class RollTheDice { //Definition of a new class
    public static void main(String[] args) { // main methed or main entry point
        Dice dice = new Dice(); // This line creates a new instance of the Dice class, allowing us to call its roll method.

        //Initializing a variable to count their occurances.
        int twoCounter =0;
        int fourCounter =0;
        int sixCounter = 0;
        int sevenCounter =0;

        //Loop begins to help execute 20 times

        for (int i =0; i <20; i++){
            int roll1 = dice.roll();// rolls the dice and stores the result in roll1 and so on.
            int roll2 = dice.roll();
            int sum = roll1+roll2;//sums both lines
            System.out.printf("Roll "+(i+1)+":\t"+roll1+" - "+roll2+"\t sum: "+sum);//prints the result of each line including their sum

            if (sum==2){
                twoCounter++;//this increments if the sum is 2, and so on.
            }else if (sum == 4){
                fourCounter++;
            }else if (sum ==6){
                sixCounter++;
            }else if (sum ==7){
                sevenCounter++;
            } //our looping ends here
        }
        System.out.println("Results:"); //prints our header "result"
        System.out.println("Two counter:" + twoCounter);//this prints the count of sums equal to 2, and so on.
        System.out.println("Four counter:" + fourCounter);
        System.out.println("Six counter:" + sixCounter);
        System.out.println("Seven counter:" + sevenCounter);


    }
}
