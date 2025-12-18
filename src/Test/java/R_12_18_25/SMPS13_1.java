package R_12_18_25;
class practise13 extends Thread {
    public void run(){
        while (true){
            System.out.println("Good Morning");
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
        practise13b p2 = new practise13b();
        p1.start();
        p2.start();
    }
}
