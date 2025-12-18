package R_12_18_25;
class monkey {
    static void jump(){
        System.out.println("jump");
    }
    static void bite(){
        System.out.println("bite");
    }
}
interface skills {
    void photography();
}
interface basicanimal {
    void walk();
    void swim();

}
class human extends monkey implements basicanimal,skills {
   @Override
    public void walk(){ System.out.println("walk"); }
    @Override
    public void swim(){ System.out.println("swim"); }
    @Override
    public void photography() {
        System.out.println("photography");
    }
}
public class SMPS11_3 {
    public static void main(String[] args) {
        human sujit = new human();
        sujit.walk();
        sujit.swim();
        sujit.jump();
        sujit.bite();
        sujit.photography();
    }
}
