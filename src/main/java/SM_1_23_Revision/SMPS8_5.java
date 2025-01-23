package SM_1_23_Revision;
class rockstar{
    String hit;
    String run;
    String fire;
    public void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("Fire");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        rockstar TommyVecetti = new rockstar();
        TommyVecetti.hit();
        TommyVecetti.run();;
        TommyVecetti.fire();
    }
}
