package R_1_29;

public class SMPS5_19 {
    public static void main(String[] args) {
    int num = 7;
    int temp = 0;
    for(int i=2;i<=num-1;i++){
        if(num%i==0){
            temp = temp +1;
        }
    }
    if (temp==1) {
        System.out.println("Its not a prime number");
    }
    else {
        System.out.println("Its a prime number");
    }
    }
}

