package R_01_01_26;

import java.util.Scanner;

public class SMPS4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        double income = sc.nextDouble();
        double tax = 0;

        if(income<250000){
            System.out.println("Your income tax is 0 rs");
        } else if (income>250000 && income<500000) {
            double taxable_income = income - 250000;
             tax = taxable_income * 0.05;
            System.out.println("your income tax is " +tax);
        }
    }
}
