package R_12_24_25;

import java.util.Scanner;

public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednsday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Enter proper number");
        }
    }
}
