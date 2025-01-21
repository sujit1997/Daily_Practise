package R_12_31;

public class SMPS5_30 {
        public static void main(String[] args) {
            int rows = 4;
            int columns = 4;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    // Print '*' for the border, otherwise print space
                    if (i == 1 || i == rows || j == 1 || j == columns) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }