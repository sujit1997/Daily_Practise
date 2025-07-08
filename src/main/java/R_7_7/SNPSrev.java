package R_7_7;

public class SNPSrev {
    public static void main(String[] args) {
        String name = "sujit";
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}
