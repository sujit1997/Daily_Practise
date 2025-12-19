package R_12_19_25;

import java.util.Scanner;

public class SMPS4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentance = sc.nextLine();

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);

            if(sentance.indexOf(ch) == sentance.lastIndexOf(ch)){
                System.out.println("character is non repeating : " +ch);
                return;
            }
        }
        System.out.println("No, non-repeating character");
    }
}
