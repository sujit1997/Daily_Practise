package R_1_30;
import java.util.Scanner;
public class SMPS5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isItPrime = true;
        for(int i=num-1;i>=2;i--){
            if(num%i==0){
                isItPrime = false;
            }
        }
        if (isItPrime==true){
            System.out.println("Number is prime number");
        }
        else {
            System.out.println("number is not prime number");
        }

    }
}
