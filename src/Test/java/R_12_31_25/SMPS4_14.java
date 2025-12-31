package R_12_31_25;

import java.util.Scanner;

public class SMPS4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentance = sc.nextLine();
        String newsentance = "";
        for(int i=0;i<sentance.length();i++){
            if(sentance.charAt(i)!='a' &&sentance.charAt(i)!='e' &&sentance.charAt(i)!='i'&& sentance.charAt(i)!='o'&& sentance.charAt(i)!='u'){
                newsentance +=sentance.charAt(i);
            }
        }
        System.out.println(newsentance);
    }
}
