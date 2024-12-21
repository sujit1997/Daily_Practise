package R_21_12;
class Tv implements smartTVRemote {
    @Override
    public void on() {
        System.out.println("tv on");
    }

    @Override
    public void off() {
        System.out.println("tv off");
    }

    @Override
    public void channel_change() {
        System.out.println("channel change");
    }

    @Override
    public void volume_change() {
        System.out.println("volume change");
    }

    @Override
    public void youtube() {
        System.out.println("Youtube on");
    }

    @Override
    public void netflix() {
        System.out.println("netflix on");

    }
}
public class SMPS11_7 {
    public static void main(String[] args) {
        Tv samsung = new Tv();
        samsung.on();
    }
}
