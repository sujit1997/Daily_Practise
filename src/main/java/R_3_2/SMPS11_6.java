package R_3_2;
interface tvremote{
    void volumeup(int increase);
    void volumedown(int decrease);
}
class smarttvremote implements tvremote {
    public void volumeup(int increase){
        System.out.println("volume up");
    }
    public void volumedown(int decrease){
        System.out.println("volume down");
    }
}
public class SMPS11_6 {
    public static void main(String[] args) {
        smarttvremote sansui = new smarttvremote();
        sansui.volumeup(5);
        sansui.volumedown(6);

    }
}
