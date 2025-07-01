package R_6_30;

public class SMPS2_4 {
    public static void main(String[] args){
        int v = 6;
        int u = 8;
        int a = 4;
        int s = 2;
        float exp = ((v*v)-(u*u)) / (2.0f*a*s);
        System.out.println(exp);
    }
}
