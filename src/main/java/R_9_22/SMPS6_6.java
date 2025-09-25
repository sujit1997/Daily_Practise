package R_9_22;

public class SMPS6_6 {
    public static void main(String[] args) {
        int[] marks = {96,74,52,63,41};
        int min = marks[0];

        for(int i=0;i<=marks.length-1;i++){
            if(min>marks[i]){
                min = marks[i];
            }
        }
        System.out.println(min);
    }
}
