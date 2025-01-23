package SM_1_23_Revision;

public class SMPS6_1 {
    public static void main(String[] args) {
        int [] marks = {56,74,85,96,74};
        int total=0;
        for(int i=0;i<= marks.length-1;i++) {
            total += marks[i];
        }
        System.out.println(total);
    }
}
