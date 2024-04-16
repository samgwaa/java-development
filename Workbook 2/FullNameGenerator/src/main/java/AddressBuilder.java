import java.util.Scanner;

import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        //Scanner for user input
        Scanner scanner = new Scanner(System.in);
        //Create a StringBuilder object
        StringBuilder addresses = new StringBuilder();
        //Prompt user for billing address
        System.out.println("Enter your billing address as follows");

        //Prompt user for billing street
        System.out.println("Enter your billing street:");
        String billingStreet = scanner.nextLine();

        //Prompt user for billing city
        System.out.println("Enter your billing city");
        String billingCity = scanner.nextLine();

        //Prompt user for billing State
        System.out.println("Enter your billing state ");
        String billingState = scanner.nextLine();

        //Prompt user for Billing Zip
        System.out.println("Enter your billing Zip:");
        String billingZip = scanner.nextLine();

        //Using the stringBuilder'
        addresses.append(billingStreet);
        addresses.append(billingCity);
        addresses.append(billingState);
        addresses.append(billingZip);





        //Prompt  user for their shipping address
        System.out.println("Enter your shipping address as follows");

        //Prompt for shipping address
        System.out.println("Enter shipping Address");

        //Prompt user for shipping Street
        System.out.println("Enter your shipping street:");
        String shippingStreet = scanner.nextLine();

        //Prompt user for shipping city
        System.out.println("Enter your shipping City:");
        String shippingCity = scanner.nextLine();

        //Prompt user for shipping state
        System.out.println("Enter your shipping state:");
        String shippingState = scanner.nextLine();

        //Prompt user for shipping zip
        System.out.println("Enter your shipping zip:");
        String shippingZip = scanner.nextLine();

        //Using the stringBuilder to add all shipping address
        addresses.append(shippingStreet);
        addresses.append(shippingCity);
        addresses.append(shippingState);
        addresses.append(shippingZip);


        //Full address
        String billingAddress = addresses.toString();
        System.out.println(billingAddress);



    }
}
