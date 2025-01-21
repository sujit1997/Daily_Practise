package R_12_24;
class practise13_2 extends Thread{
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
class practise13b_2 extends Thread{
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
public class SMPS13_2 {
    public static void main(String[] args) {
        practise13_2 p1 = new practise13_2();
        practise13b_2 p2 = new practise13b_2();
        p1.start();
        p2.start();
    }
}
