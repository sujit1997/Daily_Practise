package R_1_21;
abstract class Parent2{
    public Parent2() {
        System.out.println("Main base 2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class CH11_1 {
    public static void main(String[] args) {
    child2 c = new child2();
    //Parent2 p = new Parent2();

    }
}
