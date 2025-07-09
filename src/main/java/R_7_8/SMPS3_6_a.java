package R_7_8;

public class SMPS3_6_a {
    public static void main(String[] args) {
        String exp = "This spaces contain multiple spaces";
        String[] word = exp.trim().split("\\s+");
        System.out.println("Total word : " +word.length);
    }
}
