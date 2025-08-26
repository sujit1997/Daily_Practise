package R_8_25;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {96,74,85,52,63};
        float avg = 0;
        int total = 0;
        for(int i=0;i<=marks.length-1;i++){
            total += marks[i];
        }
        avg = total/marks.length;
        System.out.println(avg);
    }
}
