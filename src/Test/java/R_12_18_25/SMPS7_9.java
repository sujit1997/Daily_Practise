package R_12_18_25;
import java.util.Scanner;
public class SMPS7_9 {
    public static void tempConv(int cel){
        float fahr = cel *1.8f +32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cel to convert into in fahr : ");
        int cel = sc.nextInt();
        tempConv(cel);
    }
}
