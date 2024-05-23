//Write a java program that finds and prints the maximum of three numbers.

import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Determine the maximum number
        double max = num1;

        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
