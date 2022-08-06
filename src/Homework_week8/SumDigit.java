package Homework_week8;

/* Qut 04.Digit Sum Challenge
Write a method with the name sumDigitsthat has one int parameter called number.
If the parameter is >= 10 then the method should processthe number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbersfrom0-9 have 1 digitso we don't want to processthem; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1)should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.*/

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("The sum of the digits 125 is " + sumDigits(125));
        System.out.println("The sum of the digits 126 is " + sumDigits(189));
        System.out.println("The sum of the digits -123 is " + sumDigits(-231));

    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return -1;
        }
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        int firstDigit = n % 10;
        int newFirstNumber = n / 10;
        int secondDigit = newFirstNumber % 10;
        int newSecondNumber = newFirstNumber / 10;
        int thirdDigit = newSecondNumber % 10;
        sum += firstDigit + secondDigit + thirdDigit;

        return sum;
    }

}

/*
    public static int sumDigits(int n1) {
        int sum = 0;
        while (n1 >= 10) {
            int firstDigit = n1 % 10;
            int newFirstNumber = n1 / 10;
            int secondDigit = newFirstNumber % 10;
            int newSecondNumber = newFirstNumber / 10;
            int thirdDigit = newSecondNumber % 10;
            sum += firstDigit + secondDigit + thirdDigit;
            return sum;
        }
        return -1;
    }
}
*/