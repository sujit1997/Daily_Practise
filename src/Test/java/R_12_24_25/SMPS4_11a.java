package R_12_24_25;

import java.util.Scanner;

public class SMPS4_11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance to remove duplicate element : ");
        String sentance = sc.nextLine();
        String newsentance = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(newsentance.indexOf(ch)==-1){
                newsentance += ch;
            }
        }
        System.out.println(newsentance);
    }
}
