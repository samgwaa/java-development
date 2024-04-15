import java.util.Scanner;
public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter game score in format Home:Visitor|Score:Score:");
        String input = scanner.nextLine();

        //Spliiting on pipe character |
        String[] teams = input.split("[:|]");

        //split each team on colon character:
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        int homeScore = Integer.parseInt(teams[2]);
        int visitorScore = Integer.parseInt(teams[3]);
        if (homeScore>visitorScore){
            System.out.println("Winning team:"+ homeTeam);

        }else if (homeScore<visitorScore){
            System.out.println("Winning team:"+ visitorTeam);
        }else {
            System.out.print("Tie game!");
        }

    }
}
