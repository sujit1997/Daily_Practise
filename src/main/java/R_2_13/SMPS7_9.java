package R_2_13;
import java.util.Scanner;
public class SMPS7_9 {
    public static void tempconv(float celc){
        float fahr = celc *1.8f+32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celc temp ");
        float celc = sc.nextFloat();
        tempconv(celc);
    }
}
