//Write a program to check given number is prime number or not.

//Logic:

import java.util.Scanner;

//A program to check if a given number is a prime number.

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        char choice;

        // Loop until the user chooses to exit
        do {
            // Prompt the user to enter a number
            System.out.print("Enter a number to check if it is a prime number: ");
            int number = scanner.nextInt();

            // Assume the number is prime initially
            boolean isPrime = true;

            // Check if the number is less than or equal to 1
            if (number <= 1) {
                // Numbers less than or equal to 1 are not prime
                isPrime = false;
            } else {
                // Check for factors up to the square root of the number
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    // If a factor is found, the number is not prime
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            // Ask the user if they want to check another number
            System.out.print("Do you want to check another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Print a message when the user chooses to exit
        System.out.println("Thank you for using the Prime Number Checker!");
    }
}

//Output :

/*

Enter a number to check if it is a prime number: 2
2 is a prime number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a prime number: 7
7 is a prime number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a prime number: 6
6 is not a prime number.
Do you want to check another number? (y/n): y
Enter a number to check if it is a prime number: 14
14 is not a prime number.
Do you want to check another number? (y/n): n
Thank you for using the Prime Number Checker!

 */