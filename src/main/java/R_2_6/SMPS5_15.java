package R_2_6;

public class SMPS5_15 {
    public static void main(String[] args) {
        String name = "Sujit";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev = rev +name.charAt(i);
        }
        System.out.println(rev);

    }
}
