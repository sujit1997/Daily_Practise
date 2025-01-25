package R_1_25;

public class SMPS7_6 {
    static void average(int number[]){
        int total = 0;
        for(int i=0;i<= number.length-1;i++){
            total +=number[i];
        }
        float average = total/ number.length ;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int [] number = {96,74,85,76,94};
        average(number);
    }
}
