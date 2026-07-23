package R_23_07_26;
import java.util.Scanner;
public class SMPS1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        int num = sc.nextInt();
        System.out.println("Enter marks of chemistry : ");
        int num2 = sc.nextInt();
        System.out.println("Enter marks of mathematics : ");
        int num3 = sc.nextInt();

        int total = num + num2 + num3;

        float per = total/300.0f*100;
        System.out.println("your percentage is " +per);
    }
}
