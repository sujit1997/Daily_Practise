package R_12_27;

public class SMPS5_20 {
    public static void main(String[] args) {
        int a = 0, b=1;
        int c;
        System.out.println("Fibonacci Series");
        for(int i=1; i<=10; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
