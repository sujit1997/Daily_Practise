package R_7_1;
import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter marks of subject 3 : ");
        int c = sc.nextInt();
        int total = a+b+c;
        float per = total / 300.0f*100;
        if(per>40 && a>33 && b>33 && c> 33){
            System.out.println("you are passed");
        }
        else {
            System.out.println("You are failed");
        }
    }
}
