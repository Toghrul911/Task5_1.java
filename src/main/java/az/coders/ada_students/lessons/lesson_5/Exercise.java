package az.coders.ada_students.lessons.lesson_5;
import java.util.*;
public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i, j;
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
