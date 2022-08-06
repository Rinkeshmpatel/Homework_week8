package Homework_week8;
/*- Qut 02. Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.*/

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int number = 0;
        boolean first = true;

        while (true) {

            System.out.println("Enter number :- ");
            boolean hasNextInt = sc.hasNextInt();

            if (hasNextInt) {
                number = sc.nextInt();
                if (first){
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number< min){
                    min = number;
                }
            }else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("minimum = " +min+"  maximum = "+max);
        sc.close();
    }


}
Footer