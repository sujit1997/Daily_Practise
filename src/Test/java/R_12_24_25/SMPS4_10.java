package R_12_24_25;

import java.util.Scanner;

public class SMPS4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String sentance = sc.nextLine();
        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);

            if(ch!=' ' && sentance.indexOf(ch)==sentance.lastIndexOf(ch)){
                System.out.println("first non repeating word is : " +ch);
              return;
            }
        }
        System.out.println("no, non repeating character");
    }
}
