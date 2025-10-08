package R_9_30_25;
import java.util.Scanner;
public class SMPS4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        double salary = sc.nextDouble();
        double income_tax;
        double taxable_amount;
        if(salary<=250000){
            System.out.println("you not need to give income tax");
        }
        else if(salary>250000 && salary<=500000){
            taxable_amount = salary - 250000;
            income_tax = taxable_amount * 0.05;
            System.out.println(income_tax);
        } else if (salary>500000 && salary<=1000000) {
            taxable_amount = salary - 500000;
            income_tax = 12500 + (taxable_amount * 0.10);
            System.out.println(income_tax);
        }
        else if (salary>1000000){
            taxable_amount = salary - 1000000;
            income_tax = 62500+(taxable_amount * 0.15);
            System.out.println(income_tax);
        }
    }
}
