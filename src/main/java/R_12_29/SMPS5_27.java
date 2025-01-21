package R_12_29;

public class SMPS5_27 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}