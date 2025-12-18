package R_12_18_25;

import java.util.Scanner;

public class smps4_11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance ");
        String sentance = sc.nextLine();

        String newsentance = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            if(newsentance.indexOf(ch)==-1){
                newsentance +=ch ;
            }
        }
        System.out.println(newsentance);
    }
}
