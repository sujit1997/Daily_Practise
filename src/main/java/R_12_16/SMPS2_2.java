import java.util.Scanner;
public class SMPS2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade");
        char grade = sc.next().charAt(0);
        char newGrade = (char) (grade+8);
        System.out.println("Your new grade is " +newGrade);
        char oldGrade = (char) (newGrade-8);
        System.out.println("Your old grade is " +oldGrade);
    }
}
