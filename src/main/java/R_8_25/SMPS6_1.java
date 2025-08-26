package R_8_25;

public class SMPS6_1 {
    public static void main(String[] args) {
        float [] marks = {96.2f, 74.3f, 63.0f, 74.6f, 85.0f};
        float sum = 0;
        for(int i=0;i<=marks.length-1;i++){
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
