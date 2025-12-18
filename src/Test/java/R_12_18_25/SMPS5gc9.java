package R_12_18_25;

public class SMPS5gc9 {
    public static void main(String[] args) {
        String sentance = "THis sentance contain lots of words";
        int count = 0;

        sentance = sentance.trim();
        if(sentance.isEmpty()){
            System.out.println("word count : 0");
        }
        else {
            String[] words = sentance.split("\\s+");
            System.out.println("word count " +words.length);
        }
    }
}