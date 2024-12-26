package R_26_12;

public class SMPS5_15 {
    public static void main(String[] args) {
        String character = "SUJIT";
        String reverseString = " ";
        char ch;
        for(int i=0; i<character.length();i++){
            ch = character.charAt(i);
            reverseString = ch + reverseString;
        }
        System.out.println("reverse string is :" +reverseString);
    }
}
