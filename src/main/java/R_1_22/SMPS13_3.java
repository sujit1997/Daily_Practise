package R_1_22;


class practise13e extends Thread{
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
class practise13f extends Thread{
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
public class SMPS13_3{
    public static void main(String[] args) {
        practise13e p1 = new practise13e();
        p1.setPriority(6);

        practise13f p2 = new practise13f();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        //p1.start();
        //p2.start();
    }
}