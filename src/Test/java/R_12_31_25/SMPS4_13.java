package R_12_31_25;

import java.util.Scanner;

public class SMPS4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String sentance = sc.nextLine();
        String newsentance = "";

        for(int i=0;i<sentance.length();i++){
            char alphabet = sentance.charAt(i);

            if(alphabet!=' '){
                if(sentance.indexOf(alphabet) != sentance.lastIndexOf(alphabet)){
                    if(newsentance.indexOf(alphabet)== -1){
                        newsentance +=alphabet;
                    }
                }
            }
        }
        System.out.println(newsentance);
    }
}
