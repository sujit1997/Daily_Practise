import java.util.Scanner;
public class SMPS4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get day");
        int a = sc.nextInt();
        switch(a){
            case 1 :
                System.out.println("Today is monday");
                break;
            case 2 :
                System.out.println("Today is Tuesday");
                break;
            case 3 :
                System.out.println("Today is Wednsday");
                break;
            case 4 :
                System.out.println("Today is Thursday");
                break;
            case 5 :
                System.out.println("Today is Friday");
                break;
            case 6 :
                System.out.println("Today is Saturday");
                break;
            case 7 :
                System.out.println("Today is sunday");
                break;
        }
    }
}
