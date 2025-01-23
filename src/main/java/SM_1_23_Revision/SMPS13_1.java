package SM_1_23_Revision;
class practise extends Thread{
    public void run(){
    while (true){
        System.out.println("good morning");
    }
}
}
    class practiseb extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("welcome");
        }
    }
    }
public class SMPS13_1 {
    public static void main(String[] args) {
        practise p1 = new practise();
        p1.setPriority(5);
        practiseb p2 = new practiseb();
        p2.setPriority(10);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        System.out.println(Thread.currentThread().getState());

       // p1.start();
        //p2.start();


    }
}
