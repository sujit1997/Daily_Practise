package R_7_10;

public class SMPS3_10 {
    public static void main(String[] args) {
        String exp = "THis sentance contain lots letters";

        int lettercount=0;

        for(int i=0; i<exp.length();i++){
        char ch = exp.charAt(i);

        if(Character.isLetter(ch)){
            lettercount++;
        }
        }
        System.out.println("total number of letter is : " +lettercount);


    }
}
