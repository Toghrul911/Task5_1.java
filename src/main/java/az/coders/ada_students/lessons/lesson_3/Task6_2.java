package az.coders.ada_students.lessons.lesson_3;
import java.util.*;
public class Task6_2 {
    public static void main(String[] args) {
        int i;
        for(i = 1000; i <= 10000; i++){
            int a = i / 1000;
            int b = i / 100 % 10;
            int c = i / 10 % 10;
            int d = i % 10;
            if((a + b) == (c + d)){
                System.out.println(i);
            }
        }
    }
}
