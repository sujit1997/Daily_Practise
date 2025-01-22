package R_1_22;
class monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
interface basicanimal{
     void eat();
     void sleep();
}
class human extends monkey implements basicanimal{
void speak(){
    System.out.println("Hello");
}

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
    human sujit = new human();
    sujit.eat();
    sujit.sleep();
    sujit.speak();
    }
}
