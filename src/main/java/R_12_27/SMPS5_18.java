package R_12_27;
import java.util.Scanner;
public class SMPS5_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num<2){
            isPrime = false;
        }
        else{
            Math math;
            for(int i = 2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num +" is mot a prime number");
        }
    }

}