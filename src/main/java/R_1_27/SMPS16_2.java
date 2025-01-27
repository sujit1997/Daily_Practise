package R_1_27;
class mydeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am meth 1");
    }
}
public class SMPS16_2 {
    public static void main(String[] args) {
    mydeprecated d = new mydeprecated();
    d.meth1();
    }
}
