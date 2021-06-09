package az.coders.ada_students.lessons.lesson_4;
import java.util.Scanner;
public class Task7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = n + 1;
        for (int i = 2; i <= n-1; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
