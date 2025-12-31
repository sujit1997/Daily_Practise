package R_12_31_25;

import java.util.Scanner;

public class SMPS4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String sentance = sc.nextLine();
        String newsentance = "";

        for(int i=0;i<sentance.length();i++){
            char alphabet = sentance.charAt(i);

            if(alphabet !=' ' && newsentance.indexOf(alphabet)==-1){
                newsentance += alphabet;
            }
        }
        System.out.println(newsentance);
    }
}
