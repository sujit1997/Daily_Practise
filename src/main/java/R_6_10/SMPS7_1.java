package R_6_10;

public class SMPS7_1 {
    private static void multi(int num){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",num,i,num*i);
        }
    }
    public static void main(String[] args) {
        int num=5;
        multi(num);
    }
}
