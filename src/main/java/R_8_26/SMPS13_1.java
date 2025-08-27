package R_8_26;
class practise13 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class practise13b extends Thread {
    public void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
        practise13 p = new practise13();
        practise13b p2 = new practise13b();
        p.start();
        p2.start();
    }
}
