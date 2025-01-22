package R_1_22;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }

    public mythr() {

    }

    public void run(){
        int i=34;
        System.out.println("Thank you");
        //while (true) {
         //   System.out.println("I am thread");
       // }

    }
}
public class SM_73_thread_constructor {
    public static void main(String[] args) {
    mythr t1 = new mythr("sujit");
    mythr t2 = new mythr("ajit");
    t1.start();
    t2.start();
        System.out.println("The id of the thread t is : " +t1.getId());
        System.out.println("The name of the thread t is : "+t1.getName()  );
        System.out.println("The id of the thread t is : " +t2.getId());
        System.out.println("The name of the thread t is : "+t2.getName()  );
    }
}
