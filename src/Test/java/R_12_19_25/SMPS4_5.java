package R_12_19_25;

import java.util.Scanner;

public class SMPS4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check it is leap year or not");
        int year = sc.nextInt();
        if((year % 400==0)||(year % 4 ==0) && (year %100 !=0)){
            System.out.println(year + " : Leap Year");
        }
        else {
            System.out.println(year + " : is not leap year");
        }
    }
}
