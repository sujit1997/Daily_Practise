package R_12_18_25;

public class SMPS7_1 {

    public static void multi(int num){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n" ,num,i,num*i);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        multi(num);
    }
}
