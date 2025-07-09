package R_7_9;

public class SMPS2_15 {
    public static void main(String[] args) {
        String name1 = "Sujit";
        String name2 = "Sujit";
        String name3 = new String("Sujit");

        System.out.println(name1==name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));
    }
}
