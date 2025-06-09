package R_6_4;

public class SMPS4_10 {
    public static void main(String[] args) {
        String name = "sujit";
        boolean isrepeated = false;

        for(int i=0;i<name.length();i++){
           char current = name.charAt(i);
           boolean isunique = true;

            for(int j=0;j<name.length();j++){
                if(i !=j && name.charAt(i)==name.charAt(j)){
                    isunique = false;
                    break;
                }
            }

            if(isunique){
                System.out.println("first on repeating char " +current);
                isrepeated = true;
                break;
            }
        }
        if(!isrepeated){
            System.out.println("no non-repeating character is found");
        }
    }

}
