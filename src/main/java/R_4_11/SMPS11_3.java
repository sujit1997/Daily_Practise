package R_4_11;
interface basicanimal{
    void eat();
    void sleep();
}
class monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
class human extends monkey implements basicanimal {
    public static void walk(){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
    human sujit = new human();
    sujit.walk();
    sujit.eat();
    sujit.sleep();
    }
}
