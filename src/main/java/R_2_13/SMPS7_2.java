package R_2_13;

public class SMPS7_2 {
    public static void star(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star();
    }
}
