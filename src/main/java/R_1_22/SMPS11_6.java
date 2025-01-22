package R_1_22;
interface tvremote{
     void volumeup(int increase);
     void volumedown(int decrease);
}
class smarttvremote implements tvremote{
    public void volumeup(int increase){
        System.out.println("volume increase");
    }

    @Override
    public void volumedown(int decrease) {
        System.out.println("volume decrease");
    }
void netflix(){
    System.out.println("netflix");
}
}
public class SMPS11_6 {
    public static void main(String[] args) {
        smarttvremote sansui = new smarttvremote();
        sansui.netflix();
    }

}
