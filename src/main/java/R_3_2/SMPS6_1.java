package R_3_2;

public class SMPS6_1 {
    public static void main(String[] args) {
        int [] marks = {56,87,96,74,63};
        int sum = 0;
        for(int i=0;i<=marks.length-1;i++){
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
