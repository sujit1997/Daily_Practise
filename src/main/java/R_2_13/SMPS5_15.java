package R_2_13;

public class SMPS5_15 {
    public static void main(String[] args) {
        String name = "sujit";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
