package R_7_3;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your name to be reverse");
        String name = sc.next();
        String reverseName = "";

        for(int i=name.length()-1; i>=0;i--){
            reverseName += name.charAt(i);
        }
        System.out.println("Your name in reverse order is " + reverseName);
    }
}
