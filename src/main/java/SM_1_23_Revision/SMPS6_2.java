package SM_1_23_Revision;

import java.util.Scanner;

public class SMPS6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks2 = {56,45,78,89,56};
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int i=0;i<= marks2.length-1;i++){
            if(num==marks2[i]){
                isInArray = true;
            }
        }
        if (isInArray){
            System.out.println("NUmber is present in array");
        }
        else {
            System.out.println("Number is not present in array");
        }
    }
}
