package R_12_16;
import java.util.Scanner;
public class SMPS7_9 {
    static void tempConv(float cel){
        float fah = cel *1.8f+32;
        System.out.println(fah);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celsius to convert into fahrenheit");
        float cel = sc.nextFloat();
        tempConv(cel);
    }
}
