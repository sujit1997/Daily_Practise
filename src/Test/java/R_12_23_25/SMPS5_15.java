package R_12_23_25;

import java.util.Scanner;

public class SMPS5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reverse : ");
        String sentance = sc.nextLine();
        String reversestring = "";
        char ch;
        for(int i=0;i<sentance.length();i++){
            ch = sentance.charAt(i);
            reversestring = ch + reversestring;
        }
        System.out.println("reverse String is : "+reversestring);
    }
}
