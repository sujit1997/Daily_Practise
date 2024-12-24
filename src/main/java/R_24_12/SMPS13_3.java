package R_24_12;
class practise13_3 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good morning ");
        }
    }
}
class practise133b_2 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class SMPS13_3 {
    public static void main(String[] args) {
        practise13_3 p1 = new practise13_3();
        p1.setPriority(6);
        practise133b_2 p2 = new practise133b_2();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        p2.start();
    }
}
