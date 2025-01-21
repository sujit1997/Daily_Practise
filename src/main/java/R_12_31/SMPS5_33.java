package R_12_31;

public class SMPS5_33 {
        public static void main(String[] args) {
            int rows = 5; // Number of rows
            int num = 1;  // Start number

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " "); // Print the current number
                    num++; // Increment the number
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }