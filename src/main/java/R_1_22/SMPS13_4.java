package R_1_22;


class practise13g extends Thread{
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
class practise13h extends Thread{
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
public class SMPS13_4{
    public static void main(String[] args) {
        practise13g p1 = new practise13g();
        p1.setPriority(6);

        practise13h p2 = new practise13h();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p2.start();
        System.out.println(p2.getState());
        //p1.start();

    }
}
