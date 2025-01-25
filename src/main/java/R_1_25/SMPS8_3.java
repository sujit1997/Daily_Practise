package R_1_25;
import java.util.Scanner;
class square{
    int side;
    public static int area(int side){
        return side*side;
    }
    public static int perimeter(int side){
        return 4*side;
    }
}
public class SMPS8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        System.out.println(square.area(side));
        System.out.println(square.perimeter(side));

    }
}
