public class SMPS6_1 {
    public static void main(String[] args) {
        float [] marks = {56.0f,74.3f,94.9f,74.0f,46.1f};
        float sum = 0;
        for(float element : marks){
            sum += element;
        }
        System.out.println(sum);
    }
}
