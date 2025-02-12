
import java.util.Scanner;

public class SMPS1_3 {
    public static void main(String[] args) {
        Scanner sc =  new java.util.Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        float a = sc.nextFloat();
        System.out.println("Enter a marks of Chemistry : ");
        float b = sc.nextFloat();
        System.out.println("Enter a marks of Mathematics : ");
        float c = sc.nextFloat();
        float total = a+b+c;
        float per = (total/300.0f) * 100;
        System.out.format("Your percentage is %.2f%n" ,per);
        float cgpa = (per/10);
        System.out.format("Your CGPA is %.2f%n", cgpa);
    }
}
