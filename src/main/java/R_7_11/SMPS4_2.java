package R_7_11;
import java.util.Scanner;
public class SMPS4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        double sal = sc.nextDouble();
        double incomeTax = 0;

        if(sal <=300000){
            incomeTax = 0;
        }
        else if (sal <=600000) {
            incomeTax = (sal - 300000)*0.05;
        }
        else if (sal<=900000) {
            incomeTax =(300000 * 0.05)+(sal - 600000)*0.10;
        }
        else if (sal<=1200000) {
            incomeTax = (300000 * 0.05)+(300000 * 0.10)+(sal - 900000)*0.15;
        }
        else {
            incomeTax = (300000 * 0.05)+(300000 * 0.10)+(300000*0.15) + (sal-1200000)*0.20;
        }
        System.out.println("Your total income tax is : " +incomeTax);

    }
}
