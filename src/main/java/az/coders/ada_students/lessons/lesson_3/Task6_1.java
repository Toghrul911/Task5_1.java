package az.coders.ada_students.lessons.lesson_3;
import java.util.*;
public class Task6_1 {
    public static void main(String[] args){

        int p = 0;
        int n = 0;
        int z = 0;
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt() ){
            int in = input.nextInt();
            if(in > 0){
                p++;
            }else if(in < 0){
                n++;
            }else if(in == 0){
                z++;
            }
            break;
        }
        System.out.println("Positiv numbers: " + p);
        System.out.println("Negative numbers: " + n);
        System.out.println("Zeros: " + z);
    }

}
