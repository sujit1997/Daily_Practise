package R_12_27;

public class SMPS5_19 {
    public static void main(String[] args) {
        for(int num=2; num<=100; num++){
            boolean isPrime = true;
            for(int i=2; i<Math.sqrt(num); i++){
                if(num%i==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("" +num);
            }
        }
    }
}
