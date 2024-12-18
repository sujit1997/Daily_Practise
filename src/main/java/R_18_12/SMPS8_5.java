package R_18_12;

class Rockstar{

    public void hitting(){
        System.out.println("hitting");
    }
    public void running(){
        System.out.println("running");
    }
    public void firing(){
        System.out.println("firing");
    }
}
public class SMPS8_5 {
    public static void main(String[] args) {
        Rockstar tommyVecetti = new Rockstar();
        tommyVecetti.hitting();
        tommyVecetti.running();
        tommyVecetti.hitting();
    }
}
