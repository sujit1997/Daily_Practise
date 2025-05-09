package R_5_9;
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
    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
        human sujit = new human();
        sujit.sleep();
        sujit.jump();
    }
}
