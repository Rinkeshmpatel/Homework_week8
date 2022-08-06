package Homework_week8;

/*  13.Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
otherwise, the method should return false.*/

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        //check range
        if ((a <= 10 || a >= 99) || (b < 10 || b >= 99))
            return false;
        //extract last digit from a and b and assign it to individual variables
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        //reassign a and b to their firs digits by removing the last digit
        int firstDigitA = a / 10;
        int firstDigitB = b / 10;

        //compare a to b, compare a to lastDigitB, & compare b to lastDigitA
        return (firstDigitA == firstDigitB) || (firstDigitA == lastDigitB) || (lastDigitA == firstDigitB) || (lastDigitA == lastDigitB);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}