package R_5_29;
import java.util.Scanner;
public class SMPS7_9 {
    public static void tempconv(float cel){
        float fahr =  cel *1.8f+32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celci");
        float cel = sc.nextFloat();
        tempconv(cel);
    }
}
