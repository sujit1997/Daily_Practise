package R_12_24_25;

import java.util.Scanner;

public class SMPS5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int reversenum=0;

        while(num!=0) {
            int rem = num % 10;
            reversenum = reversenum * 10 + rem;
            num = num / 10;
        }
        System.out.println(reversenum);
    }
}
