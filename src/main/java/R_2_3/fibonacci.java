package R_2_3;
import java.util.Scanner;
class fibRec {
    public static int fib(int n){
        if(n==1)return 0;
        if(n==2)return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series");
        for(int i=1;i<=n;i++){
            System.out.println(fib(i)+" ");
    }
    sc.close();
}
}