package R_3_2;

public class SMPS6_3 {
    public static void main(String[] args) {
        int []marks = {56,74,85,96,74};
        int sum = 0;
        for(int i=0;i<=marks.length-1;i++){
            sum += marks[i];
        }
        float avg = sum/ marks.length;
        System.out.println(avg);
    }
}
