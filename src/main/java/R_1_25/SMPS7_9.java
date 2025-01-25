package R_1_25;
import java.util.Scanner;
public class SMPS7_9 {
    static void temp(float cel){
        float fahr =cel *1.8f+32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cel temp to convert into fahr: ");
        float cel = sc.nextFloat();
        temp(cel);
    }
}
