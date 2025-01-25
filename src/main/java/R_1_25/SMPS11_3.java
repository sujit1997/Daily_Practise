package R_1_25;
class Monkey{
    public void jump(){
        System.out.println("Jumpinng");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
interface Basicanimal{
    public void sleep();
    public void eat();

}
class human extends Monkey implements Basicanimal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep");
    }

    @Override
    public void jump() {
        super.jump();
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
    human sujit = new human();
    sujit.eat();
    sujit.jump();
    sujit.sleep();
    sujit.bite();
    }
}
