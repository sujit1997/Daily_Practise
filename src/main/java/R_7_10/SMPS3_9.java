package R_7_10;

public class SMPS3_9 {
    public static void main(String[] args) {
        String exp = "This sentance count the vowels and consonents";
        int vowel = 0;
        int consonent = 0;

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetter(ch)){
                if(ch =='a' ||ch=='e' || ch=='i' || ch=='o' ||ch=='u' ){
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }
        System.out.println("vowel : "+vowel);
        System.out.println("consonents : " +consonent);


    }
}
