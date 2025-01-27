package R_1_27;
interface Myint{
    void display();
}
public class SMPS16_4 {
    public static void main(String[] args) {
        Myint i =new Myint() {
            @Override
            public void display() {
                System.out.println("i am display");
            }
        };
    }
}
