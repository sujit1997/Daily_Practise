package R_27_12;

import java.util.Scanner;

public class SMPS5_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to reversedNum
            num /= 10; // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}
