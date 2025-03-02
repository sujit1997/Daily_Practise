package R_3_2;
class practise1 extends Thread{
    public void run(){
            System.out.println("Good Morning");
        }
    }
class practiseb2 extends Thread{
    public void run(){
         System.out.println("Welcome");
        }
    }
public class SMPS13_3 {
    public static void main(String[] args) {
        practise1 p1 = new practise1();
        p1.setPriority(6);
        practiseb2 p2 = new practiseb2();
        p2.setPriority(10);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
