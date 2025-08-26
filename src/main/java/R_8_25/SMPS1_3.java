package R_8_25;
import java.util.Scanner;
public class SMPS1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        int a = sc.nextInt();
        System.out.println("Enter marks of chemistry : ");
        int b = sc.nextInt();
        System.out.println("Enter marks of mathematics : ");
        int c = sc.nextInt();
        int total = a+b+c;
        float per = total / 300.0f*100;
        System.out.println("your percentage is : " +per);
        float cgpa = per/10.0f;
        System.out.println("your cgpa is : "+cgpa);
    }
}
