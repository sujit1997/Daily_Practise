package R_8_26;
class  monkey {
    public static void jump(){
        System.out.println("jump");
    }
    public static void bite(){
        System.out.println("bite");
    }
}
interface basicanimal {
void eat();
void sleep();
}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("eat");
    }
    public  void sleep(){
        System.out.println("sleep");
    }
}

public class SMPS11_3 {
    public static void main(String[] args) {
        human s1 = new human();
        s1.eat();
        s1.sleep();
        s1.jump();
        s1.bite();
    }
}
