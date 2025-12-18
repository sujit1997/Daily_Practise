package R_12_18_25;

import java.util.Scanner;

public class SMPS4_11a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentance :");
        String sentance = sc.nextLine();
        String result = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(result.indexOf(ch)==-1){
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
