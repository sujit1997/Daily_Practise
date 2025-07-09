package R_7_8;

public class SMPS3_6 {
    public static void main(String[] args) {

       String exp = "This sentance contain lots of words";
        int count = 0;

        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println(count+1);

    }
}
