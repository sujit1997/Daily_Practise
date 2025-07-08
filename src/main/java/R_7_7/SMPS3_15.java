package R_7_7;
import java.util.Scanner;
public class SMPS3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me sentance to reverse");
        String exp = sc.next();
        String rev = "";
        for (int i = exp.length() - 1; i > 0; i--) {
            rev = String.valueOf(exp.charAt(i));
        }
        System.out.println(rev);
    }
}