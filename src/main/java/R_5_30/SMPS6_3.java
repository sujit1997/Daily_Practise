package R_5_30;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {96,74,85,63,41};
        int total = 0;
        float avg;
        for(int i=0;i<= marks.length-1;i++){
            total += marks[i];
        }
        avg = total / marks.length;
        System.out.println(avg);
    }
}
