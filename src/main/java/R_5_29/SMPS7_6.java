package R_5_29;
import java.util.Scanner;
public class SMPS7_6 {
    public static void avg(int [] marks){
        int total = 0;
        for(int i=0;i<= marks.length-1;i++){
            total += marks[i];
        }
        float avg = total / marks.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {56,84,74,56,53};
        avg(marks);
    }
}
