package R_1_26;
import java.util.Scanner;
public class SMPS7_3 {
    static void sum(int num){
        int total = 0;
        for(int i=1;i<=num;i++){
            total +=i;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number toget sum of natural number till that number");
        int num = sc.nextInt();
       sum(num);
    }
}
