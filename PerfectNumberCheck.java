//Write a java program to check given number is perfect number or not.

//Logic:

import java.util.Scanner; // Import the Scanner class for user input

public class PerfectNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice; // Variable to store the user's choice to continue or exit

        do {
            // Prompt the user to enter a number to check
            System.out.print("Enter a number to check if it is a perfect number: ");
            int number = scanner.nextInt(); // Read the number from the user

            int sum = 0; // Variable to store the sum of divisors

            // Find and sum all proper divisors of the number
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                    sum += i; // Add the divisor to the sum
                }
            }

            // Check if the number is a perfect number
            if (sum == number && number != 0) {
                System.out.println(number + " is a perfect number."); // Print if the number is perfect
            } else {
                System.out.println(number + " is not a perfect number."); // Print if the number is not perfect
            }

            // Ask the user if they want to check another number
            System.out.print("Do you want to check another number? (y/n): ");
            choice = scanner.next().charAt(0); // Read the user's choice

        } while (choice == 'y' || choice == 'Y'); // Continue if the user enters 'y' or 'Y'

        // Print a message when the user chooses to exit
        System.out.println("Thank you for using the Perfect Number Checker!");
    }
}



//Output:

/*

Enter a number to check if it is a perfect number: 14
14 is not a perfect number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a perfect number: 29
29 is not a perfect number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a perfect number: 30
30 is not a perfect number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a perfect number: 6
6 is a perfect number.
Do you want to check another number? (y/n): n
Thank you for using the Perfect Number Checker!

 */
