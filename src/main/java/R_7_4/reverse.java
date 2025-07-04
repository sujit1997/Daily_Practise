package R_7_4;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String exp = sc.next();
        String reverse ="";
        for(int i=exp.length()-1;i>=0;i--){
            reverse += exp.charAt(i);
        }
        System.out.println(reverse);
    }
}
