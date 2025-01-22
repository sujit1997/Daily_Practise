package R_1_22;
class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
        int i=34;

        while (true) {
        System.out.println("Thank you "+this.getName());
        }

    }
}
public class SM_74 {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("sujit");
        mythr1 t2 = new mythr1("ajit");
        mythr1 t3 = new mythr1("pankaj");
        mythr1 t4 = new mythr1("anni");
        mythr1 t5 = new mythr1("sanket");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
