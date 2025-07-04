package R_7_4;

import java.util.Scanner;

public class SMNP1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        int decimal = sc.nextInt();
        String binary = "";
        int number  = decimal;
        while(number >0){
            int reminder = number %2;
            binary = reminder + binary;
            number = number /2;
        }
        if(decimal ==0){
            binary = "0";
        }
        System.out.println("Binary representation of " +decimal+ "is : " +binary);
    }
}
