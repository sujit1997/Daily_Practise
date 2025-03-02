package R_3_2;
import java.util.Scanner;
public class SMPS1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        int a = sc.nextInt();
        System.out.println("Enter marks of chemistry : ");
        int b =  sc.nextInt();
        System.out.println("Enter marks of Mathematics : ");
        int c = sc.nextInt();
        int total = a+b+c;
        float per = total/300.0f*100;
        System.out.format("YOUR PERCENTAGE IS %.2f",per);
        System.out.println();
        float cgpa = per/10.0f;
        System.out.format("YOUR CGPA IS %.1f", cgpa);
    }
}
