package R_1_22;
class MyThreads1 extends Thread{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThreads2 extends Thread{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("thread  2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class SM_70 {
    public static void main(String[] args) {
    MyThreads1 t1 = new MyThreads1();
    MyThreads2 t2 = new MyThreads2();
    t1.start();
    t2.start();
    }
}
