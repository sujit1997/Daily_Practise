package R_12_18_25;

public class SMPS5_15 {
    public static void main(String[] args) {
        String name = "Sujit";
        String reverseString="";
        char ch;
        for(int i=0;i<name.length();i++){
            ch = name.charAt(i);
            reverseString = ch +reverseString;
        }
        System.out.println("reverse String is : "+reverseString);

    }
}
