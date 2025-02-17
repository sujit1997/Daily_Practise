package R_2_13;

abstract class telephone{
    public static void ring(){
        System.out.println("Ring");
    }
    public static void lift(){
        System.out.println("lift");
    }
    public static void disconnect(){
        System.out.println("Disconnect");
    }
}
class smarttele extends telephone{

}
public class SMPS11_4 {
    public static void main(String[] args) {
        smarttele moto = new smarttele();
        moto.ring();
        moto.lift();
        moto.disconnect();
    }
}
