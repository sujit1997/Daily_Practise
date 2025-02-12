package R_1_31;

import java.util.Scanner;

public class SMPS14_3 {
    public static void main(String[] args) {
        boolean flag  = true;
        int [] marks = {96,74,85,41,52};
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<7){
       try{
           System.out.println("ENter the value of index");
           index = sc.nextInt();
           System.out.println("THe value of marks int is " + marks[index]);
           break;
       }
       catch (Exception e){
           System.out.println("Invalid index");
           i++;
       }
       }
        if(i>=5){
            System.out.println("error");
        }
    }
}
