package SM_1_23_Revision;

public class SMPS7_4 {
    static void star2(){
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
