package R_6_3;

public class SMPS4_11 {
    public static void main(String[] args) {
        String name = "ABB";
       String result = "";

        for(int i=0;i<name.length();i++){
        char current = name.charAt(i);

        //check if current  character is already in result
        boolean duplicate = false;

        for(int j=0; j< result.length();j++){
            if(current == result.charAt(j)){
                duplicate = true;
                break;
            }
        }

        if(!duplicate){
            result += current;
        }
        }
        System.out.println("String after removing duplicate " + result);
    }
}
