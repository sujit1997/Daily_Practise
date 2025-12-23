package R_12_20_25;

import java.util.Scanner;

public class SMPS4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your income : ");
        double income = sc.nextDouble();
        double taxableincome = 0;
        double tax = 0;
        if(income <250000){
            taxableincome = income - 250000;
            tax = 0.00*taxableincome;
        } else if (income>250000 && income<500000) {
            taxableincome = income - 250000;
            tax = 0.05*taxableincome;
        } else if (income>500000 && income<=1000000) {
            taxableincome = income - 500000;
            tax = (0.20* taxableincome)+12500;
        } else if (income>1000000) {
            taxableincome = income-1000000;
            tax = (0.30 * taxableincome)+112500;
        }

        System.out.println(tax);
    }
}
