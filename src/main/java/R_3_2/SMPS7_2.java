package R_3_2;

public class SMPS7_2 {
    public static void star1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star1();
    }
}
