// Write a java program that reverses the digits of a given number.

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }

    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
