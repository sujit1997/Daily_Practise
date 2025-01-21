import java.util.Scanner;
public class SMPS4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("it's an even number");
        }
        else {
            System.out.println("It's an odd number");
        }
    }
}
