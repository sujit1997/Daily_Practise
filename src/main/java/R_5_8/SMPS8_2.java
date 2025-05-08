package R_5_8;
class cellphone{
    String ring;
    String vibrate;

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    public String getVibrate() {
        return vibrate;
    }

    public void setVibrate(String vibrate) {
        this.vibrate = vibrate;
    }
}
public class SMPS8_2 {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring = "ding dong";
        samsung.vibrate = "bhurr bhurr";
        System.out.println(samsung.getRing());
        System.out.println(samsung.getVibrate());
    }
}
