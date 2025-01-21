package R_12_16;

public class SMPS7_6 {
    static void calcAvg(int [] marks){
        int total =0;
        for(int element : marks){
            total +=element;
        }
        float average = total/ marks.length;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int [] marks= {65, 74, 85, 96, 54};
        calcAvg(marks);
    }
}
