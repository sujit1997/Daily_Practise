package R_7_4;

public class SMPS3_2 {
    public static void main(String[] args) {
        String exp = "this sentance";
        int count = 0;

        for(int i=0; i<exp.length();i++){
                char ch= exp.charAt(i);
                if(Character.isLetter(ch)){
                    count++;
                }
        }
        System.out.println(count);
    }
}
