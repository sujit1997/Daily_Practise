package R_5_8;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {63,41,52,74,85};
        float avg = 0;
        int total = 0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        avg = total/ marks.length;
        System.out.println(avg);
    }
}
