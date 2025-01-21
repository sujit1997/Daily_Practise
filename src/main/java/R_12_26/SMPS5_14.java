package R_12_26;

public class SMPS5_14 {
    public static void main(String[] args) {
        int num = 12345;
        int ans = 0;
        while(num!=0){
            int lastDigit = num%10;
            ans = ans * 10 + lastDigit;
            num = num/10;
        }
        System.out.println("Reverse number " +ans);
    }
}
