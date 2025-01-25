package R_1_25;
class message extends Thread{
    public void run(){
        while(true) {
            try {
                Thread.sleep(400);
            }
            catch (Exception e){
                System.out.println(e);
            }

            System.out.println("good morning");
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
    message m1 = new message();
    //m1.run();
    m1.setPriority(10);
        System.out.println(m1.getPriority());
        System.out.println(m1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
