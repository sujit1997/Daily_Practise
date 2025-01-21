package R_12_21;
class monkey2{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal2{
    void eat();
    void sleep();
}
class human2 extends monkey2 implements BasicAnimal2{
    void speak2(){
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
public class SMPS11_5 {
    public static void main(String[] args) {
        human sujit = new human();
        sujit.sleep();
        sujit.jump();

        monkey2 m1 = new human2();
        m1.jump();
        m1.bite();
        // m1.speak2(); // cannot use speak method because the referance is monkey which does not have speak method

        BasicAnimal2 lovesh = new human2();
        // lovesh.speak(); // cannot use because basic animal not contain speak
        lovesh.eat();
        lovesh.sleep();
    }
}
