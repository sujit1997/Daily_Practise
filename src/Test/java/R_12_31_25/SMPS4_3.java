package R_12_31_25;

import java.util.Scanner;

public class SMPS4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();

        if(income<=250000){
            System.out.println("income tax = 0");
        } else if (income>250000 && income<=500000) {
            double taxable_income = income - 250000;
            double tax = taxable_income * 0.05;
            System.out.println(tax);
        } else if (income>500000 && income<=1000000) {

            double taxable_income = income - 500000;
            double tax = taxable_income * 0.20 + 12500;
            System.out.println(tax);
        } else if (income>1000000) {
            double taxable_income = income - 1000000;
            double tax = taxable_income * 0.30 + 112500;
            System.out.println(tax);
        }
    }
}
