package R_5_8;

public class SMPS5_17 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        b = a+b; // 4+5 = 9
        a = b-a; // 5-9 = 4
        b = b-a; // 9-4 =5
        System.out.println(a);
        System.out.println(b);
    }
}
