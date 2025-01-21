package R_12_27;

public class SMPS5_21 {
    public static void main(String[] args) {
        int terms = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.println(fibonacci(i));
        }
    }

    // Recursive method to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }
}
