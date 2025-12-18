package R_12_21;
class monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello");
    }
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
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
