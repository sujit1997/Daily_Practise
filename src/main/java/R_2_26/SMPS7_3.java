package R_2_26;

public class SMPS7_3 {
    static void add(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num = 5;
        add(num);
    }
}
