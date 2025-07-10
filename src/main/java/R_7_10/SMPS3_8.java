package R_7_10;

public class SMPS3_8 {
    public static void main(String[] args) {
        int num = 1123457;
        int count = 0;
      if(num==0){
          count =1;
      }else {
          for(int temp = num; temp!=0; temp/=10){
              count++;
          }
      }
        System.out.println("Number of digits in "+num+"is : " +count);
    }
}
