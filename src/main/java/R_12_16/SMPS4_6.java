import java.util.Scanner;
public class SMPS4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your domain : ");
        String domain = sc.next();
        if (domain.endsWith(".com")) {
            System.out.println("This is commercial domain");
        }
        else if (domain.endsWith(".in")) {
            System.out.println("This is an Indian domain");
        }
        else if (domain.endsWith(".org")) {
            System.out.println("This is an organisational domain");
        }
        else {
            System.out.println("You gave wrong imput");
        }
    }
    }

