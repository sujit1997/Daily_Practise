package R_27_12;

import java.util.Scanner;

public class SMPS5_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;

        // Find and sum up all divisors of the number (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == num && num > 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
