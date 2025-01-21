package R_12_21;
interface TVRemote{
    void on();
    void off();
    void channel_change();
    void volume_change();
}
interface smartTVRemote extends TVRemote{
    void youtube();
    void netflix();
}
class sansui implements smartTVRemote{
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
public class SMPS11_6 {
    public static void main(String[] args) {
        sansui m21 = new sansui();
        m21.on();
        m21.channel_change();
        m21.netflix();
        m21.off();
    }
}
