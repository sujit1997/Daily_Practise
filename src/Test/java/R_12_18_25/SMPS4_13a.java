package R_12_18_25;

import java.util.Scanner;

public class SMPS4_13a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentance :");
        String sentance = sc.nextLine();

        String duplicate = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(ch !=' ' && sentance.indexOf(ch)!=sentance.lastIndexOf(ch) && duplicate.indexOf(ch)==-1) {
                    duplicate += ch;
                }
            }
        System.out.println(duplicate);
    }
}
