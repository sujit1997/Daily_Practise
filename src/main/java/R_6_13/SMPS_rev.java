package R_6_13;

public class SMPS_rev {
    public static void main(String[] args) {
        String name= "sujit";
        int leng = name.length();
        String rev = "";
        for(int i=leng-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}
