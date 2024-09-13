package ProjectDemo;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        String continueResponse;

        do {
            System.out.print("Enter an integer value: ");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }

            System.out.print("Do you want to check another number? (yes/no): ");
            continueResponse = scan.next();

        } while (continueResponse.equalsIgnoreCase("yes"));

        scan.close();
        
        System.out.println("Thank you for using the EvenOddChecker!");
    }
}


