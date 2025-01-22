package R_1_22_Eve;
class practise13 extends Thread{
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
class practise13b extends Thread{
    public void run(){
        while (true){
            System.out.println("welcome");
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
        practise13 p1 = new practise13();
        //p1.run();
        p1.setPriority(6);
        practise13b p2 = new practise13b();
       // p2.run();
        p2.setPriority(10);
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
