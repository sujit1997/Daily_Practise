package R_12_18_25;

import java.util.Scanner;

public class SMPS4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance");
        String sentance = sc.nextLine();

        char maxChar = ' ';
        int maxCount = 0;
        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            int count = 0;
            if(ch==' ')continue;
            for (int j=0;j<sentance.length();j++){
                if(sentance.charAt(j)==ch){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxChar = ch;
            }
        }
        System.out.println("Maximum occuring character : " +maxChar);
        System.out.println("Count: " +maxCount);
    }
}