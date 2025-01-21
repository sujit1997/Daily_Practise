package R_12_28;

import java.util.Scanner;

public class SMPS5_25b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Initialize the minimum digit as the highest possible digit (9)
        int minDigit = 9;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            if (digit < minDigit) {
                minDigit = digit; // Update minimum digit if smaller digit is found
            }
            num /= 10; // Remove the last digit
        }

        System.out.println("The minimum digit is: " + minDigit);
    }
}