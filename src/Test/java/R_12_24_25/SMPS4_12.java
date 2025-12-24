package R_12_24_25;

import java.util.Scanner;

public class SMPS4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to find maximum occuring character : ");
        String sentance = sc.nextLine();
        int maxcount=0;
        char maxchar = ' ' ;

        for(int i=0;i<sentance.length();i++){
            char ch = sentance.charAt(i);
            int count = 0;

            if(ch ==' ')continue;
            for(int j=0;j<sentance.length();j++){
                if(sentance.charAt(j)==ch){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxchar = ch;
            }
        }
        System.out.println("maximum occuring character " +maxchar);
        System.out.println("count " +maxcount);
    }
}
