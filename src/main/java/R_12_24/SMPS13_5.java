package R_12_24;
class practise13_5 extends Thread{
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
class practise135b_2 extends Thread{
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
public class SMPS13_5 {
    public static void main(String[] args) {
        practise13_5 p1 = new practise13_5();
        p1.setPriority(6);
        practise135b_2 p2 = new practise135b_2();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        //  System.out.println(p2.getState()); // It give new state here in output it give new because it not started yet and if it start it give runnable in output
        //p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
