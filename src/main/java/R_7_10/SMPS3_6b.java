package R_7_10;

public class SMPS3_6b {
    public static void main(String[] args) {
        String str = "This sentance contain lots of words";
        int wordCount = 0;
        boolean inword = false;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!Character.isWhitespace(ch)){
                if(!inword){
                    wordCount++;
                    inword = true;
                }
            }else {
                inword = false;
            }
        }
        System.out.println("Total words : " +wordCount);
    }
}
