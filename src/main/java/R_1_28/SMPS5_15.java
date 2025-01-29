package R_1_28;

public class SMPS5_15 {
    public static void main(String[] args) {
       String character = "Sujit";
       String reversestring = "";
       char ch ;
       for(int i=0;i<character.length();i++){
           ch = character.charAt(i);
           reversestring = ch +reversestring;
       }
        System.out.println(reversestring);
    }
}
