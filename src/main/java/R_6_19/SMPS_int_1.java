package R_6_19;

public class SMPS_int_1 {
    public static void main(String[] args) {
        String exp = "we want to count words in this sentance";
        int count = 0;
        for(int i=0; i<exp.length();i++){
            if(exp.charAt(i)==' '){
                count += 1;
            }
        }
        System.out.println(count+1);
    }
}
