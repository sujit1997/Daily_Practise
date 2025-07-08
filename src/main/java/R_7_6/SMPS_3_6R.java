package R_7_6;

public class SMPS_3_6R {
    public static void main(String[] args) {
        String exp = "This sentance contain multiple letter";
        String[] word = exp.trim().split("\\s+");
        int wordCount = word.length;
        System.out.println(wordCount);
    }
}
