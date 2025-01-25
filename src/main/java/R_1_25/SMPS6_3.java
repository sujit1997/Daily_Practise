package R_1_25;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks= {96,74,85,52,41};
        float average = 0;
        int total = 0;
        for(int element : marks){
            total+=element;
        }
        average = total/ marks.length;
        System.out.println(average);
    }
}
