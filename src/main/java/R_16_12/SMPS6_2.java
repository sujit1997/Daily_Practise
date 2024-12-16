public class SMPS6_2 {
    public static void main(String[] args) {
        int [] marks = {45, 84, 63, 74, 95};
        int num = 86;
        boolean isPresent = false;
        for(int i=0;i< marks.length;i++){
            if(marks[i]==num) {
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            System.out.println("given number is present in array");
        }
        else{
            System.out.println("given number is not present in array");
        }


    }
}
