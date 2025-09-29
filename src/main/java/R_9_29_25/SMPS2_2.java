package R_9_29_25;
import java.util.Scanner;
public class SMPS2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);
        char newgrade = (char)(grade+8);
        System.out.println("your grade is "+newgrade);
    }
}
