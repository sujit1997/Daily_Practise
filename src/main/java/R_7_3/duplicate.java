package R_7_3;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.next();
        int count = 0;
        char[] alpha = name.toCharArray();
        for(int i=0; i<alpha.length; i++){
           for(int j=i+1; j<alpha.length; j++){
               if(alpha[i]==alpha[j]){
                   System.out.println("duplicate character in string are : " +alpha[j]);
                   count++;
               }
           }
        }
        System.out.println("duplicate character count "  +count );

    }
}
