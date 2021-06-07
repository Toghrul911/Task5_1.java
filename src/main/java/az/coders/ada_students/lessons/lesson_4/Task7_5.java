package az.coders.ada_students.lessons.lesson_4;
import java.util.*;
public class Task7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = input.nextInt();
        if(n == 1){
            System.out.println("Monday");
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if(n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n == 6){
            System.out.println("Saturday");
        }else if(n == 7){
            System.out.println("Sunday");
        }
    }
}


//We can write this program with switch statement.
//package az.coders.ada_students.lessons.lesson_4;
//
//        import java.util.Scanner;
//
//public class Example {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int n = input.nextInt();
//        switch(n){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//    }
//}
