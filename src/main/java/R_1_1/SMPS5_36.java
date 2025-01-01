package R_1_1;

public class SMPS5_36 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print numbers with spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
