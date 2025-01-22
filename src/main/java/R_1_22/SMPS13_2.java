package R_1_22;

class practise13c extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("good morning");
        }
    }
}
class practise13d extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class SMPS13_2{
    public static void main(String[] args) {
        practise13c p = new practise13c();
        practise13d p2 = new practise13d();
        p.start();
        p2.start();
    }
}