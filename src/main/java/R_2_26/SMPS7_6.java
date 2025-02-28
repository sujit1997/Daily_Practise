package R_2_26;

public class SMPS7_6 {
    public static void main(String[] args) {
        int total = 0;
        int [] num ={56,74,95,75,63};
        for(int element :num){
            total +=element;
        }
        float avg = total/num.length+1;
        System.out.println(avg);
    }
}
