package R_21_12;
class FountainPen extends pen {
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
    FountainPen pen = new FountainPen();
    pen.changeNib();
}
}