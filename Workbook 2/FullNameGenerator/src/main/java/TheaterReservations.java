import java.util.Scanner;
public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: LastName, FirstName");
        String name = scanner.nextLine();
        System.out.println("WWhat date will you like? enter this format (MM/dd/yyyy):");
        String date  = scanner.nextLine();
        System.out.println("Enter the number of tickets you need:");
        int numTickets = scanner.nextInt();

        //Reserved ticket confirmation
        String confirmationMessage = numTickets +"tickets(s) reserved for" + date + "under" + ""+ name;
        if (numTickets==1) {
            confirmationMessage ="1 ticket reserved for " + date +"under" + ""+name;
        }
        System.out.println(confirmationMessage);

    }

}
