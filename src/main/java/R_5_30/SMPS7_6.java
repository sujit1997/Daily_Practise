package R_5_30;

public class SMPS7_6 {
    public static void avg(int marks[]){
        int total = 0;
        float average = 0;
        for(int i=0;i<= marks.length-1;i++){
            total +=marks[i];
        }
        average = total / marks.length;
        System.out.println(average);

    }
    public static void main(String[] args) {
        int [] marks= {96,74,85,41,63};
        avg(marks);
    }
}
