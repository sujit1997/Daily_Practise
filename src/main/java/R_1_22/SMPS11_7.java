package R_1_22;
class tv implements tvremote{
    @Override
    public void volumeup(int increase) {
        System.out.println("volume up");
    }

    @Override
    public void volumedown(int decrease) {
        System.out.println("volume down");
    }

}
public class SMPS11_7 {
    public static void main(String[] args) {
        tv lg = new tv();
        lg.volumedown(1);

    }
}
