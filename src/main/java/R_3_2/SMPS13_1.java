package R_3_2;
class practise extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class practiseb extends Thread{
    public void run(){
        while(true){
//            try {
//                Thread.sleep(200);
//            }catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome");
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
        practise p1 = new practise();
        p1.setPriority(6);
        practiseb p2 = new practiseb();
        p2.setPriority(10);
        p1.start();
        p2.start();
    }
}
