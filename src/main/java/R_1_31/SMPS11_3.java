package R_1_31;
class monkey{
    public void jump(){
        System.out.println("Jump");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
interface basicanimal{
    public void sleep();
    public void eat();
}
class Human extends monkey implements basicanimal{
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
        Human sujit = new Human();
        sujit.eat();
        sujit.sleep();
        sujit.jump();
    }
}
