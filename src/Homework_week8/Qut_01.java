package Homework_week8;

import java.util.Scanner;

public class Qut_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true) {

            System.out.println("What number do you want to add to the sum :- ");
            boolean isAnumber = sc.hasNext();

            if(isAnumber) {
                int number = sc.nextInt();
                sum+= number;
                System.out.println("The sum is now "+sum);
                counter++;

                if(counter ==10){
                    break;
                }

            }
            else {
                System.out.println("An invalid value was entered. The sum did not change");
                sc.nextInt();
            }
        }
        sc.close();
    }

}