package R_2_6;

public class SMPS5_19 {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            int temp = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    temp = temp+1;
                }
            }

        }
    }
}
