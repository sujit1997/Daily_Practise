package R_2_3;
import java.util.Scanner;
public class wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.nextLine();
        String[] words = input.split("\s+");
        System.out.println("NO of word is " + words.length);
    }
}
