package R_7_3;

public class varargs {
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result +=a;
        }return result;
    }
    public static void main(String[] args) {
        System.out.println("The addition nothing is : " +sum());
        System.out.println("The addition is 4 & 5 is : " +sum(4,5));
        System.out.println("The addition is 4 & 5 & 6 is : " +sum(4,5,6));
    }
}
