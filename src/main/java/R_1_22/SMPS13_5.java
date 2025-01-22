package R_1_22;


class practise13i extends Thread{
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
class practise13j extends Thread{
    public void run(){
        // while(false){
        //   try{
        //       Thread.sleep(400);
        //  }
        //  catch (Exception e){
        //     System.out.println(e);
        //}
        //System.out.println("Welcome");
        //        }
    }
}
public class SMPS13_5{
    public static void main(String[] args) {
        practise13i p1 = new practise13i();
        p1.setPriority(6);

        practise13j p2 = new practise13j();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
           //p1.start();

    }
}
