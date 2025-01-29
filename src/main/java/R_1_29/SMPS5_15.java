package R_1_29;

public class SMPS5_15 {
    public static void main(String[] args) {
        String name = "SUJIT";
        String rev = "";
        int length = name.length();
        for(int i=length-1;i>=0;i--){
        rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }

}
