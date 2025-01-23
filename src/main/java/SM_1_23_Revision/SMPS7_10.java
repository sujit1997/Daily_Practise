package SM_1_23_Revision;

import java.util.Scanner;
public class SMPS7_10 {
static int numrec2(int num){
    for(int i=1;i<=10;i++){
        System.out.println(num);
    }
    return num;
}

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    int num = sc.nextInt();
    numrec2(num);
}  }
