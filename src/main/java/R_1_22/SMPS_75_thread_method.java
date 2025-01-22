package R_1_22;
class mythr2 extends Thread{
    public void run(){
        int i=0;
       while (true) {
            System.out.println("Thank you ");
           try {
               Thread.sleep(566);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           i++;
        }
    }
}
class mythr3 extends Thread{
       public void run(){
        while (true) {
            System.out.println("hi ");
        }
    }
}
public class SMPS_75_thread_method {
    public static void main(String[] args) {
    mythr2 t7 = new mythr2();
    mythr3 t6 = new mythr3();
    t7.start();
    // try{
        //     t7.join();
        //  }
        // catch(Exception e){
        //   System.out.println(e);
        //   }

    t6.start();

    }
}
