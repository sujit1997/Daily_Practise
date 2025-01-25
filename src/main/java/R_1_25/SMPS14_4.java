package R_1_25;
import java.util.Scanner;
class MaxRetiresException extends Exception{
    @Override
    public String getMessage(){
        return "more than 5 tries is not possible";
    }
}
public class SMPS14_4 {
    public static void main(String[] args) {
        boolean flag = true;

        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=153;
        Scanner sc = new Scanner(System.in);
        int index ;
        int i=0;
        while(flag){
            try{
                if (i>=5){
                    throw new MaxRetiresException();
                }
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[ind] is: " +marks[index]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index please enter between 2 to 2");
            i++;
            } catch (Exception e) {
                System.out.println("An unexpected error : " + e.getMessage());
                i++;
            }
        }
    }
}
