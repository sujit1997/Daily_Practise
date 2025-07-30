package R_7_29;

public class SMPS5_14 {
    public static void main(String[] args) {
        int num = 12345;
        int rev =0;
        while(num !=0){
            int lastdigit = num % 10;
            rev = rev * 10 + lastdigit;
            num = num/10;
        }
        System.out.println("Reverse number " +rev);
    }
}
