package R_12_18;

class Square{
    int side;
        public int area(){
            return side * side;
        }
        public int perimeter(){
            return 4*side;
        }
}
public class SMPS8_3 {
    public static void main(String[] args) {
    Square sq = new Square();
    sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
