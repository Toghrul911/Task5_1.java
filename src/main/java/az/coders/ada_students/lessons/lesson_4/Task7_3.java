package az.coders.ada_students.lessons.lesson_4;
import java.util.*;
public class Task7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = input.nextInt();

        if(a > b && a > c || a == b && a > c || a == c && a > b){
            System.out.println("Greatest number: " + a);
        }else if(b > a && b > c || b == c && b > a){
            System.out.println("Greatest number: " + b);
        }else if(c > a && c > b){
            System.out.println("Greatest number: " + c);
        }else if(a == b && b== c ){
            System.out.println("Numbers are equal");
        }
    }
}
