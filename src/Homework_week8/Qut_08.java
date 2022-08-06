package Homework_week8;
/*Qut 08. Display right angle triangle of @ using nested for loops*/
import java.util.Scanner;

public class Qut_08 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter right :- ");
        int raw = sc.nextInt();

        System.out.println("Enter perinting pattern ");
        for (int i = 1; i <= raw; i++) {
            for (int j = 1 ; j <= i ; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }

}