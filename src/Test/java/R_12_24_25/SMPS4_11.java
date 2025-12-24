package R_12_24_25;

import java.util.Scanner;

public class SMPS4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a sentance to remove duplicate from string : ");
        String sentance = sc.nextLine();
        String newsentance = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(ch!=' ' &&newsentance.indexOf(ch)==-1){
                newsentance += ch;
            }
        }
        System.out.println(newsentance);
    }
}
