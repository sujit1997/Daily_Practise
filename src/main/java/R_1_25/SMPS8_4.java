package R_1_25;

import java.util.Scanner;

import java.util.Scanner;
class Rect{
    int length;
    int width;
    public static int area(int length,int width){
        return length*width;
    }
    public static int perimeter(int length, int width){
        return 4*(length*width);
    }
}
public class SMPS8_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        Rect r1 = new Rect();
        System.out.println(Rect.area(length,width));
        System.out.println(Rect.perimeter(length,width));



    }
}
