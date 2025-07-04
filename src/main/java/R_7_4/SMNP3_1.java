package R_7_4;

public class SMNP3_1 {
    public static void main(String[] args) {
        String exp = "This sentance contain vowels and consonants";
        int vowels = 0;
        int consonents = 0;

        exp = exp.toLowerCase();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch >='a' && ch <='z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                        || ch == 'u') {
                    vowels ++;
                }
                else{
                    consonents++;
                }
            }
        }
        System.out.println("Vowels " + vowels);
        System.out.println("Consonents " + consonents);
    }
}
