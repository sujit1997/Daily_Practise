package SM_1_23_Revision;
import java.util.Scanner;
public class SMPS1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km to convert into miles : ");
        float km = sc.nextFloat();
        float miles = km*0.60f;
        System.out.println(miles);
    }
}
