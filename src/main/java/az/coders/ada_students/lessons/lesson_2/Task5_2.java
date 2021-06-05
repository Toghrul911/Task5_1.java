package az.coders.ada_students.lessons.lesson_2;
import java.util.*;
public class Task5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch(in) {
            case 5:
                System.out.print("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
        }
        if(in <= 4 && in >= 0){
            System.out.println("Suspenso");
        }else if(in == 9 || in == 10){
            System.out.println("Sobresaliente");
        }
    }
}
