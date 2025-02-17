package R_2_13;

public class SMPS6_3 {
    public static void main(String[] args) {
        int [] marks = {96,74,85,41,63};
        int sum = 0;
        for(float element : marks){
            sum +=element;
        }
        System.out.println("The average of value is " + sum/ marks.length);

    }
}
