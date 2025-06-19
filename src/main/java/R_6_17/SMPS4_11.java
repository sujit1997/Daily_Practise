package R_6_17;

public class SMPS4_11 {
    public static void main(String[] args) {
        String name = "Sujjit";
        String result = "";

        for(int i=0;i<name.length();i++){
        char current = name.charAt(i);


        boolean repeating = false;

        for(int j=0;j<result.length();j++){
            if(current == name.charAt(j)){
            repeating = true;
            break;
                }
            }

        if(!repeating){
            result += current;
        }
        }
        System.out.println("String after removing duplicate " + result);
    }
}
