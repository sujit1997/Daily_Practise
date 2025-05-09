package R_5_9;

interface tvremote{
    public void volumeup();
    public void volumedown();
}
interface smartTvRemote extends tvremote{
    void youtube();
    void netflix();
    private void greet(){
        System.out.println("hi");
    }
    default void message(){
        System.out.println("get message");
    }
}
class sansui implements smartTvRemote{
    @Override
    public void volumeup() {
        System.out.println("volume up");
    }

    @Override
    public void volumedown() {
        System.out.println("volume down");
    }

    @Override
    public void youtube() {
        System.out.println("youtube");
    }

    @Override
    public void netflix() {
        System.out.println("netflix");
    }
}
public class SMPS11_6 {
    public static void main(String[] args) {
        sansui s1 = new sansui();
        s1.netflix();
        s1.youtube();
        s1.message();
    }
}
