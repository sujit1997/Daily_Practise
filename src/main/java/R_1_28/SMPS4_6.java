package R_1_28;
import java.util.Scanner;
public class SMPS4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your domain name");
        String domain = sc.next();
        if(domain.endsWith(".com")){
            System.out.println("its an commercial domain");
        }
        else if(domain.endsWith(".in")){
            System.out.println("Its an Indian domain");
        } else if (domain.endsWith(".org")) {
            System.out.println("Its organisal website");
        }
        else {
            System.out.println("Enter proper domain");
        }
    }
}
