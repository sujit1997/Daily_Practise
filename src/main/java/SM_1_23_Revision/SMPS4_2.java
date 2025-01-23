package SM_1_23_Revision;
import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        int a = sc.nextInt();
        System.out.println("Enter marks of chemistry");
        int b = sc.nextInt();
        System.out.println("Enter marks of Mathematics");
        int c = sc.nextInt();
        int total = a+b+c;
        float per = total/300.0f*100;
        if(per>40 && a>33 && b>33 && c>33){
            System.out.println("Passed");
        }
        else {
            System.out.println("Fail");
        }

    }
}
