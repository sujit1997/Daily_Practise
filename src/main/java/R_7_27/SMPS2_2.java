package R_7_27;
import java.util.Scanner;
public class SMPS2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade");
        char grade = sc.next().charAt(0);
        char newgrade = (char)(grade + 8);
        System.out.println(newgrade);

    }
}
