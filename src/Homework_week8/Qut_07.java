package Homework_week8;


/*
7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.
 */
public class Qut_07 {

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        //extracts the last digit of the number (remainder of modulo 10)
        //ex: 121 % 10 == 1
        int lastDigit = number % 10;
        System.out.println("last digit = " + lastDigit);
        //initialize firstDigit variable to lastDigit so if the number is less than 10, it is assigned the same value
        int firstDigit = lastDigit;
        while (number != 0) {
            //removes the last digit on the number
            //ex: 121/10 == 12 -> 12/10 == 1
            number /= 10;
            if(number % 10 == 0)
                break;
            //assign the first digit of the number to firstDigit variable once there is
            //a single digit left. When a single digit is left ( 1 - 9 ) the conditional
            //statement number / 10 == 0 will evaluate to true since any digit 1-9 divided by
            //10 will return less than one, and an int value will return 0.
            //ex: 1/10==0, 2/10==0, ...., 9/10==0
            firstDigit = number;

        }
        System.out.println("first digit = " + firstDigit);
        sum = lastDigit + firstDigit;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of the first and last digit of 828 is = " + sumFirstAndLastDigit(828));
        System.out.println("The sum of the first and last digit of 98 is = " + sumFirstAndLastDigit(98));
        System.out.println("The sum of the first and last digit of 5 is = " + sumFirstAndLastDigit(5));
        System.out.println("The sum of the first and last digit of -3 is = " + sumFirstAndLastDigit(-30));
        System.out.println("The sum of the first and last digit of -3 is = " + sumFirstAndLastDigit(-3));
        System.out.println("The sum of the first and last digit of -47 is = " + sumFirstAndLastDigit(-47));
    }
}