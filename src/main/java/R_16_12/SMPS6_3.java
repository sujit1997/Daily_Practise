    public class SMPS6_3 {
        public static void main(String[] args) {
            int [] marks = {56, 74, 84, 63, 74};
            float average = 0;
            int total=0;
            for(int element : marks){
               total +=element;
            }
            average = (float) total / marks.length;
            System.out.println(average);

        }
    }
