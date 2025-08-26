package R_8_26;
 abstract class telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();

}
class smarttelephone extends telephone{
      void ring(){
          System.out.println("ringing");
     }
     void lift(){
         System.out.println("lift the phone");
     }
     void disconnect(){
         System.out.println("disconnect the phone");
     }
}
public class SMPS11_4 {
    public static void main(String[] args) {
        telephone motorola = new smarttelephone();
        motorola.ring();
        motorola.lift();
        motorola.disconnect();
    }
}
