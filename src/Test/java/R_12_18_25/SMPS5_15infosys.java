package R_12_18_25;

public class SMPS5_15infosys {
    public static void main(String[] args) {
        String name = "Sujit@123";

        String cleanString = "";
        String reverseString = "";

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch>='A'&& ch<='Z'|| ch>='a' && ch<='z'){
                cleanString += ch;
            }
        }

        for(int i=0;i<cleanString.length();i++){
            reverseString =  cleanString.charAt(i) + reverseString;
        }
        System.out.println(reverseString);
    }
}