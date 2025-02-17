package R_2_13;

public class SMPS7_6 {
    public static void avgset(int []marks){
        int sum = 0;
        for(int element:marks){
            sum +=element;
        }
        float avg = sum/ marks.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int [] marks = {96,74,85,74,96};
        avgset(marks);
    }
}
