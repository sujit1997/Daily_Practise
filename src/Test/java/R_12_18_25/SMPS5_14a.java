package R_12_18_25;

public class SMPS5_14a {
    public static void main(String[] args) {
        int num = 123;
        int rev=0;
        while(num !=0){
            int lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
