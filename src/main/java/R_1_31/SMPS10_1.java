package R_1_31;
class circle{
    int radius;
    public void give(){
        System.out.println("display message");
    }
    public int area(int radius){
        return radius *radius;
    }
}
class cylinder extends circle{
public int area(int radius){
    return radius*radius;
}
static class child extends cylinder{

}

}
public class SMPS10_1 {
    public static void main(String[] args) {
        cylinder.child c1 = new cylinder.child();
        c1.give();
        System.out.println(c1.area(6));

    }
}
