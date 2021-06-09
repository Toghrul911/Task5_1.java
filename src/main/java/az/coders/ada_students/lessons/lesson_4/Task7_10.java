package az.coders.ada_students.lessons.lesson_4;
import java.util.*;
public class Task7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 2;
        System.out.println("Expected Output: ");
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("It is prime number.");
        }else{
            System.out.println("It is not prime number.");
        }
    }
}
