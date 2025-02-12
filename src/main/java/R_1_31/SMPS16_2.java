package R_1_31;
class deprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
public class SMPS16_2 {
    public static void main(String[] args) {
    deprecated d1 = new deprecated();
    d1.meth1();
    }
}
