package R_27_12;

import java.util.Scanner;

public class SMPS5_23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number
        int sum = 0;

        // Count the number of digits in the number
        int digits = String.valueOf(num).length();

        // Calculate the sum of the power of each digit
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Add digit^digits to the sum
            num /= 10; // Remove the last digit
        }

        // Check if the original number and the calculated sum are the same
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}