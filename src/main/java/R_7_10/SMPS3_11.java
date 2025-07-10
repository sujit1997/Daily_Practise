package R_7_10;

public class SMPS3_11 {
    public static void main(String[] args) {
        String sentance = "this sentance contain lots of alphabet";
        String sentance1 = sentance.toLowerCase();

        int[] freq = new int[26];

        for(int i=0;i<sentance1.length();i++){
            char ch = sentance1.charAt(i);
            if(ch>= 'a' && ch<='z'){
                freq[ch - 'a']++;
            }
        }
        System.out.println("Alphabet frequency :");
        for(int i=0;i<26;i++){
            if(freq[i] >0){
                System.out.println((char)(i + 'a')+": " +freq[i]);
            }
        }
    }
}
