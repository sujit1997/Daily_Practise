package R_2_6;

public class SMPS5_18 {
    public static void main(String[] args) {
        int num = 10;
        boolean isItPrime = true;
        for(int i=num-1;i>=2;i--){
            if(num%i==0){
                isItPrime = false;
            }
        }
        if (isItPrime==true){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
