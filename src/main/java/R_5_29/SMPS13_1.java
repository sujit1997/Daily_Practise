package R_5_29;
class practise2 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class practise2b extends  Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
        practise2 p1 = new practise2();
        practise2b p2 = new practise2b();
        p1.start();
        p2.start();
    }
}
