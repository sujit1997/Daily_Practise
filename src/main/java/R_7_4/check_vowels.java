package R_7_4;
import java.util.Scanner;
public class check_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a expression to to check vowels are present or not");
        String exp = sc.next();
        for(int i=0;i<=exp.length()-1;i++){
            char ch = exp.charAt(i);
            if(ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u'){
                System.out.println("This word or sentance conatin vowels");
                break;
            }
        }
    }
}
