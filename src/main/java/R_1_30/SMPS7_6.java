package R_1_30;

public class SMPS7_6 {
    static void avg(int [] marks){
        float avg ;
        int total = 0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        avg = total/ marks.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int [] marks = {96,74,85,52,63};
        avg(marks);
    }
}
