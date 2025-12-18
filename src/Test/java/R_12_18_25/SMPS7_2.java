package R_12_18_25;

public class SMPS7_2 {
    public static void star(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star();
    }
}
