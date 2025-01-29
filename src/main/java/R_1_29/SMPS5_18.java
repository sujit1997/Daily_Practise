package R_1_29;

public class SMPS5_18 {
    public static void main(String[] args) {
        int num = 10;
        int temp =0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                temp = temp+1;
            }
        }
        if(temp >0){
            System.out.println("Its a not prime number");
        }
        else {
            System.out.println("Its a prime number");
        }
    }
}
