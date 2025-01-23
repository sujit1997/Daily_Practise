package SM_1_23_Revision;

public class SMPS7_6 {
    static void ave(int marks3[]){
        float average = 0;
        int total=0;
        for(int element : marks3){
            total+=element;
        }
        average = total/ marks3.length;
        System.out.println(average);
    }
    public static void main(String[] args) {
        int [] marks3= {56,84,74,56,53};
        ave(marks3);
    }
}
