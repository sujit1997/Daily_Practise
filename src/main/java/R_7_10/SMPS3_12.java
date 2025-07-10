package R_7_10;

public class SMPS3_12 {
    public static void main(String[] args) {
        String sentance = "This sentance contain only one the word";
        String sentance1 = sentance.toLowerCase();

        String[] words = sentance1.split("\\s+");

        int count = 0;
        for(String word : words){
            if(word.equals("the")){
                count++;
            }
        }
        System.out.println("Occurance of the word is : " +count);
    }
}
