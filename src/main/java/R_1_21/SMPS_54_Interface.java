package R_1_21;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee pee po po");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }

    @Override
    public void speedup(int increment) {

    }

    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
}

public class SM_54_Interface {
    public static void main(String[] args) {
        AvonCycle cyclesujit = new AvonCycle();
        cyclesujit.applyBrake(1);
        System.out.println(cyclesujit.a);
    }
}