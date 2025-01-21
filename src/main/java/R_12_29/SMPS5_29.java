package R_12_29;

public class SMPS5_29 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print first star
            System.out.print("*");

            // Print spaces between the stars
            for (int j = 1; j <= (2 * (rows - i) - 1); j++) {
                System.out.print(" ");
            }

            // Print second star, if not the last row
            if (i != rows) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
