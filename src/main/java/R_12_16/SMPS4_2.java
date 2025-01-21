import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics : ");
        float a = sc.nextFloat();
        System.out.println("Enter marks of Mathematics : ");
        float b = sc.nextFloat();
        System.out.println("Enter marks of Chemistry : ");
        float c = sc.nextFloat();
        float total = a+b+c;
        float per = (total/300.0f)*100;
        if (per>40.0f && a>33 && b>33 && c>33){
            System.out.println("You are passed");
        }
        else {
            System.out.println("You are failed");
        }
    }
}
