package R_6_10;
class monkey{
    public static void jump(){
        System.out.println("jump");
    }
    public static void bite(){
        System.out.println("bite");
    }
}
interface basicanimal {
    void eat();
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("eating");
    }
}
public class SMPS11_2 {
    public static void main(String[] args) {
    human aman = new human();
    aman.eat();
    aman.jump();
    }
}
