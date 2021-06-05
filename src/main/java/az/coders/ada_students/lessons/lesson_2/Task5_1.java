package az.coders.ada_students.lessons.lesson_2;
import java.util.Scanner;
public class Task5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            if (a == 'a' || a == 'i' || a == 'o' || a == 'u' ||
                    a == 'A' || a == 'I' || a == 'O' || a == 'U') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }else{
            System.out.println("Error");
        }
    }
}