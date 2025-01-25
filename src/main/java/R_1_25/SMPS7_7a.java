package R_1_25;
import java.util.Scanner;
public class SMPS7_7a {
    static void repeat(int count,int num){
        if(count==0){
            return;
        }
        System.out.println(num);
        repeat(count-1, num);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter count number that how many time its repet number");
        int count  = sc.nextInt();
        System.out.println("number which repeat");
        int num = sc.nextInt();
        repeat(count,num);
    }
}
