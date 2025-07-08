package R_7_6;

public class SMPS_3_6_b {
    public static void main(String[] args) {
        String input = "This sentance also contain lots of letters";
        int wordCount = 0;
        boolean inword = false;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(!Character.isWhitespace(ch)){
                if(!inword){
                    wordCount++;
                    inword = true;
                }
            }
            else{
                inword = false;
            }
        }
        System.out.println("Total words :" +wordCount);
    }
}
