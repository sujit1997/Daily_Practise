package R_2_13;

public class SMPS7_4 {
    public static void star2(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star2();
    }
}
