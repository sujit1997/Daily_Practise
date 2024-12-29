package R_29_12;

public class SMPS5_28a {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print a single star
            System.out.println("*");
        }
    }
}
