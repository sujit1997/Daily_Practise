package R_1_26;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {96,74,85,52,63};
        float average = 0;
        int total =0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        average = total/ marks.length;
        System.out.println(average);
    }
}
