package R_3_2;
import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics");
        int a = sc.nextInt();
        System.out.println("Enter marks of Chemistry");
        int b = sc.nextInt();
        System.out.println("ENter marks of Mathematics");
        int c = sc.nextInt();
        int total = a+b+c;
        float per = total / 300.0f*100;
        if(per>40 && a>33 && b>33 && c>33){
            System.out.println("YOU ARE PASSED");
        }
        else {
            System.out.println("YOU ARE FAILED");
        }
    }
}
