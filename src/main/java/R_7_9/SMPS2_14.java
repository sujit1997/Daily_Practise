package R_7_9;
import java.util.Scanner;
public class SMPS2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter actual value : ");
        int actual_value = sc.nextInt();

        System.out.println("Enter expected value : ");
        int expected_value = sc.nextInt();

        System.out.println("Error code (0 if there is no error)");
        int error_code = sc.nextInt();

        if( actual_value == expected_value && error_code ==0 ){
            System.out.println("Test case passed ");
        }
        else {
            System.out.println("Test case fail");
        }
    }
}
