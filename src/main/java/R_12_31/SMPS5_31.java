package R_12_31;

public class SMPS5_31 {
        public static void main(String[] args) {
            int size = 5; // Size of the X pattern (should be an odd number)

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    // Print '*' if the position matches the diagonals
                    if (j == i || j == size - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }