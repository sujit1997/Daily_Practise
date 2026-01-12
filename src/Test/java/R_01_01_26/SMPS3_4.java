package R_01_01_26;

import java.util.Scanner;

public class SMPS3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance");
        String sentance = sc.nextLine();
        System.out.println(sentance.indexOf("  "));
        System.out.println(sentance.indexOf("   "));
    }
}
