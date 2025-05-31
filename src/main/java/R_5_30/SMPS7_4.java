package R_5_30;

public class SMPS7_4 {
    public static void star(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        star();
    }
}
