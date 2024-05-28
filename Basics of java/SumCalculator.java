//Write a program that takes two numbers as input and prints their sum.

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Calculate the sum of the two numbers
        double sum = number1 + number2;

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

