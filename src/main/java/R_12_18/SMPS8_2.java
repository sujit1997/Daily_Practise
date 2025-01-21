package R_12_18;

class cellPhone{

    public void ring(){
        System.out.println("Ringing");
    }

    public void vibrate(){
        System.out.println("Vibrating");;
    }
    public void callFriend(){
        System.out.println("calling a friend");
    }

}

public class SMPS8_2 {
    public static void main(String[] args) {
     cellPhone samsung = new cellPhone();
     samsung.callFriend();
     samsung.vibrate();
     samsung.ring();


    }
}
