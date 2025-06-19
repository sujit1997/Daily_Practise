package R_6_10;
interface eDevices{
    public static void on(){}
    public static void off(){}
}
interface soundDevices{
    public static void volumeup(){}
    public static void volumedown(){}
}

class tv implements eDevices , soundDevices{
    public static void on(){
        System.out.println("ON");
    }
    public static void off(){
        System.out.println("off");
    }
    public static void volumeup(){
        System.out.println("volume up");
    }
    public static void volumedown(){
        System.out.println("volume down");
    }

}
public class SMPS11_8 {
    public static void main(String[] args) {
        tv samsung = new tv();
        tv.on();
        tv.volumeup();
        tv.volumedown();
        tv.off();
    }
}
