package SM_1_23_Revision;
import java.util.Scanner;
public class SMPS7_9 {
    static void tempconv(float cel){
        float fahr =  cel *1.8f+32;
        System.out.println(fahr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  temp in cel");
        float cel = sc.nextFloat();
        tempconv(cel);
    }
}
