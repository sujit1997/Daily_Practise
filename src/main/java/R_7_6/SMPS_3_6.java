package R_7_6;

public class SMPS_3_6 {
    public static void main(String[] args) {

        String exp ="hi this program is for counting word";

        String[] word = exp.trim().split("\\s+");

        int wordCount = word.length;

        System.out.println("Total words: " +wordCount);

    }
}
