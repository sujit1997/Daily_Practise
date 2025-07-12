package R_7_12;

public class SMPS3_6 {
    public static void main(String[] args) {
        String sentance = "hi This sentace contain lots of string";
        String[] word = sentance.trim().split("\\s+");
        System.out.println("Total word in this sentance "+word.length);

    }
}
