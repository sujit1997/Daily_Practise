package R_7_12;

public class SMPS3_rr {
    public static void main(String[] args) {
        String sentance = "This sentance contain lots of spaces";
        String[] word = sentance.trim().split("\\s+");
        System.out.println(word.length);
    }
}
