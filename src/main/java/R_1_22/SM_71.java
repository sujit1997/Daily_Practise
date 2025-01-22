package R_1_22;
class myThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am threat not thread 1");
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am threat not thread 2");
    }
}

public class SM_71 {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet1);
        gun1.start();
        gun2.start();
    }
}
