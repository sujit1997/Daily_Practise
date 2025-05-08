package R_5_8;
import java.util.Scanner;
public class SMPS7_3 {
    public static void add(int num){
        int addition = 0;
        for(int i=0;i<=num;i++){
            addition += i;
        }
        System.out.println(addition);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its addition of first natural number");
        int num = sc.nextInt();
        add(num);
    }
}
