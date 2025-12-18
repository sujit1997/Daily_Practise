package R_12_18_25;

import java.util.Scanner;

public class SMPS4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance ");
        String sentance = sc.nextLine();

        String duplicate = "";

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);

            if(ch != ' '){
                if(sentance.indexOf(ch) != sentance.lastIndexOf(ch)){
                    if(duplicate.indexOf(ch)==-1){
                        duplicate += ch;
                    }
                }

            }
        }
        System.out.println(duplicate);
        }


    }