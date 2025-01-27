package R_1_27;
class message extends Thread{
    public void first() {
        int i = 0;
        while (i <= 10) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("good morning");
            i++;
        }
    }
    public void second(){
        int j=1;
       while (j<=10){
        System.out.println("welcome");
        j++;
        }
    }
}
public class SMPS13_1 {
    public static void main(String[] args) {
        message m1 = new message();
       // m1.first();
        //m1.second();
        m1.setPriority(5);
        System.out.println(m1.getPriority());
        System.out.println(m1.getState());
        System.out.println(m1.currentThread().getState());
    }
}
