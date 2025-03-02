package R_3_2;
import java.util.Scanner;
public class SMPS7_9 {
    public static void tempConv(float cel){
        float fahr = cel *1.8f+32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cel to convert into fahr");
        float cel = sc.nextFloat();
        tempConv(cel);
    }
}
