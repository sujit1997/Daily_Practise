package R_5_7;
import java.util.Scanner;
public class SMPS4_6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter domain name : ");
        String domain = sc.next();
        if(domain.endsWith(".com")){
            System.out.println("Its a commercial domain");
        } else if (domain.endsWith(".in")) {
            System.out.println("Its an Indian Domain");
        } else if (domain.endsWith(".org")) {
            System.out.println("Its an organisational domain");
        }
        else {
            System.out.println("Enter proper domain name");
        }
    }
}
