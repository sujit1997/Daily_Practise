package R_7_12;
import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        double income = sc.nextDouble();
        double incomeTax = 0;

        if(income<=300000){
            incomeTax =0;
        }
        else if (income<=600000) {
            incomeTax = (income - 300000) *0.05;
        }
        else if (income <=900000) {
            incomeTax = (300000 * 0.05) + (income - 600000)*0.10;
        }
        else if (income <=1200000) {
            incomeTax = (300000 * 0.05) + (300000 * 0.10) + (income - 900000)*0.15;
        }
        else {
            incomeTax = (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (income - 1200000)*0.20;
        }
        System.out.println("Your total income Tax is : " +incomeTax);
    }
}
