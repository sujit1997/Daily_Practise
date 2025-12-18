package R_12_18_25;

import java.util.Scanner;

public class SMPS4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentance = sc.nextLine();

        String newsentance = "";


        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(ch!='a' && ch!='e'&& ch!='i' && ch!='o' && ch!='u'){
                newsentance += ch;
            }
        }
        System.out.println(newsentance);
    }
}