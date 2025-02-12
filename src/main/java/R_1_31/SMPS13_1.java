package R_1_31;
class practise extends Thread{
    public void run(){// run method is mandatory because its method defined in thread class
        int i=1;
        while (i<=10){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good morning");
            i++;
        }
    }
}
class practiseb extends Thread{
    public void run(){
        int i=1;
        while (i<=10){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome");
            i++;
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
    practise p1 = new practise();
    practiseb p2 = new practiseb();
    p1.start();
    p2.start();
    p1.setPriority(5);
        System.out.println(p1.getPriority());
        System.out.println(p1.getState());
        System.out.println(p1.currentThread().getState());
    }
}
