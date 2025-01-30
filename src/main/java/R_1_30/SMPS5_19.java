package R_1_30;
import java.util.Scanner;
public class SMPS5_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isItPrime = true;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                isItPrime = false;
            }
        }
        if(isItPrime){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }
}
