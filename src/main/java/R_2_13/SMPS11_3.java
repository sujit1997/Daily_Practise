package R_2_13;
class monkey{
    public static void jump(){
        System.out.println("jump");
    }
    public static void bite(){
        System.out.println("bite");
    }
}
interface basicanimal{
    public void sleep();
}
class human extends monkey implements basicanimal{
    public static void walk(){
        System.out.println("Walk");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
        human sujit = new human();
        sujit.walk();
        sujit.jump();
        sujit.sleep();
    }
}
