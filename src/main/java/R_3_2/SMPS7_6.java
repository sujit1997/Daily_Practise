package R_3_2;

public class SMPS7_6 {
    public static void avg(int [] marks){
        int sum = 0;
        for(int i=0;i<=marks.length-1;i++){
            sum += marks[i];
        }
        System.out.println(sum);
        float avg = sum/marks.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int [] marks = {56,74,86,96,32};
        avg(marks);

    }
}
