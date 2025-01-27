package R_1_26;

public class SMPS7_6 {
    static void avg(int [] marks){
        int total = 0;
        float average = 0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        average = total/ marks.length;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int [] marks = {56,54,57,59,31};
        avg(marks);

    }
}
