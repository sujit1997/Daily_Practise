package R_1_21;

interface Bicycle {
    int a = 45; // Public, static, and final by default
    void applyBrake(int decrement);
    void speedup(int increment); // Correct method name
}

class AvonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("Pee pee po po");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brake with decrement: " + decrement);
    }

    @Override
    public void speedup(int increment) { // Correct method name
        System.out.println("Speeding up with increment: " + increment);
    }
}

public class SMPS_54_Interface {
    public static void main(String[] args) {
        AvonCycle cyclesujit = new AvonCycle();
        cyclesujit.applyBrake(1);
        cyclesujit.speedup(2); // Calling the speedup method
        System.out.println(Bicycle.a); // Accessing static variable from the interface
        cyclesujit.blowHorn();
    }
}
