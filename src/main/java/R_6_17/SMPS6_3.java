package R_6_17;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {56,74,96,74,32};
        int total = 0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        float average = total/ marks.length;
        System.out.println(average);
    }
}
