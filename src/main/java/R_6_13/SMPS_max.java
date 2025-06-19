package R_6_13;

import java.util.Arrays;

public class SMPS_max {
    public static void main(String[] args) {
        int [] marks = {63,41,105,30,99};
        int max = marks[0];
        for(int i = 1;i<=marks.length-1;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println(max);
    }
}
