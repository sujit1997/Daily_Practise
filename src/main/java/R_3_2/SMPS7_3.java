package R_3_2;

public class SMPS7_3 {
    public static void sum(int num){
        int total = 0;
        for(int i=1;i<=num;i++){
            total +=i;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int num = 10;
        sum(num);
    }
}
