package R_12_18_25;
class practise13c extends Thread {
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
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
        while (true){
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }
}
public class SMPS13_2 {
    public static void main(String[] args) {
        practise13c p3 = new practise13c();
        p3.setPriority(6);
        practise13d p4 = new practise13d();
        p4.setPriority(9);
        System.out.println(p3.getPriority());
        System.out.println(p4.getPriority());
        System.out.println(p3.getState());
        System.out.println(p4.getState());
        System.out.println(Thread.currentThread().getState());
        p3.start();
        p4.start();


    }
}
