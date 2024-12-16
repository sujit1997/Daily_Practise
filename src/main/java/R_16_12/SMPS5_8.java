import java.util.Scanner;
public class SMPS5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Factorial of a " + num + " is : ");
        int fact = 1;
        for(int i=num;i>=1;i--){
          fact *=i;
        }
        System.out.println(fact);
    }
}
