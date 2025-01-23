package SM_1_23_Revision;

public class SMPS7_2 {
    static void star(){
        for(int i=1;i<=5;i++){
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
