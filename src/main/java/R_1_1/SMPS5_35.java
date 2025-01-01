package R_1_1;

public class SMPS5_35 {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}