import java.util.Scanner;
public class SMPS5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + " is : ");
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d", num ,i, num*i);
            System.out.println();
        }
    }
}
