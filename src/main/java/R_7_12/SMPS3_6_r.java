package R_7_12;

public class SMPS3_6_r {
    public static void main(String[] args) {
        String sentance = "This sentance contain lots of word and need to rembebr logic of this program";
        String[] word = sentance.trim().split("\\s+");
        System.out.println("TOtal word in this sentance is : " +word.length);
    }
}
