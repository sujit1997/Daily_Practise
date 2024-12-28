package R_28_12;

import java.util.Scanner;

public class SMPS5_25a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int maxDigit = 0;

        // Extract digits and find the maximum
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            if (digit > maxDigit) {
                maxDigit = digit; // Update the maximum digit
            }
            num /= 10; // Remove the last digit
        }

        System.out.println("The maximum digit is: " + maxDigit);
    }
}