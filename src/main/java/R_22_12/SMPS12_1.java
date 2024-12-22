package R_22_12;

import static java.lang.Math.sin;

class calculator{
    public void calculate(int a, int b){
        System.out.println("your result is " + a+b);
    }

}
class scCalculator{
public void calculate(int a, int b){
    System.out.println("your result is " + a+b);
}
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("your result is " + a+b);
        System.out.println("your result is " + sin(a+b));
    }

}

public class SMPS12_1 {
    public static void main(String[] args) {
        System.out.println("I am main method! ");
    }
}
