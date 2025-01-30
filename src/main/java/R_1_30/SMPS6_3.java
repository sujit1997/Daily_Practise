package R_1_30;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] array = {56,74,96,85,46};
        float average = 0;
        float total = 0;
        for(int i=0;i<= array.length-1;i++){
            total +=array[i];
        }
        average = total/ array.length;
        System.out.println(average);
    }
}
