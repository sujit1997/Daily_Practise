package R_1_29;

public class SMPS5_19 {
    public static void main(String[] args) {

   for(int no=2;no<=100;no++){
       int temp = 0;
       for(int j=2;j<=no/2;j++){
        if(no%j==0){
             temp = temp+1;
        }
       }
        if(temp==0){
            System.out.println(no);
        }
       }
   }
}
