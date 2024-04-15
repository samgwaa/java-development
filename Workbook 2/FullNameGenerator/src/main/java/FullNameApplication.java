import java.util.Arrays;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt the user for an input
        System.out.println("What is your name?");
        System.out.print("Enter your first name:");
        String firstName = scanner.next().trim();
        System.out.print("Enter your second name: N/A if you do not have one");
        String secondName;
        secondName = scanner.next().trim();
        System.out.print("Enter your last name:");
        String lastName = scanner.next().trim();
        String fullName = firstName + ""+lastName;


        if (!secondName.isEmpty()) {
            fullName += "," + secondName + lastName;
        }
        //suffix
        if (!scanner.nextLine().isEmpty()) {
            fullName += "'" + scanner.nextLine().trim();

        }
        System.out.println("Your full name is:"+fullName);

    }

}
