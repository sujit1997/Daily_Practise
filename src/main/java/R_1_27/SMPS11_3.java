package R_1_27;
class monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
interface basicanimal {
    public void sleep();
    public void eat();
}
class human extends monkey implements basicanimal{

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
     human sujit = new human();
     sujit.eat();
     sujit.sleep();
     sujit.jump();
    }
}
