package R_6_10;

public class SMPS6_1 {
    public static void main(String[] args){
        float [] marks= {56.0f,96.4f,74.3f,74.3f,63.4f};
        float sum = 0;
        for(int i=0;i<=marks.length-1;i++){
            sum += marks[i];
        }
        System.out.println(sum);
    }
}
