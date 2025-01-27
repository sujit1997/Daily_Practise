package R_1_27;

import java.util.Scanner;

public class SMPS14_3 {
    public static void main(String[] args) {
        boolean flag = true;
        int marks [] = new int[5];
        marks[0] = 56;
        marks[1] = 54;
        marks[2] = 456;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[ind] is: " +marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("error");
        }

    }
}
