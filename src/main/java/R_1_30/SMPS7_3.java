package R_1_30;

public class SMPS7_3 {
    static void naturalsum(int num){
        int total = 0;
        for(int i=1;i<=num;i++){
            total +=i;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int num = 10;
        naturalsum(num);

    }
}
