package R_1_22;
 class telephone{
    public void ring(){
        System.out.println("Ring");
    }
    public void life(){
        System.out.println("lift");
    }
    public void disconnect(){
        System.out.println("disconnect");
    }

}
class smartphone{
     public void videocall(){
         System.out.println("Video call");
     }
}
public class SMPS11_4 {
    public static void main(String[] args) {
    smartphone sm1 = new smartphone();
    sm1.videocall();
    }
}
