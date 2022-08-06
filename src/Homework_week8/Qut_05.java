package Homework_week8;
/*
Qut-05.Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
Itshould return true ifthe number is a palindrome number otherwise itshould return false.
Check the tips below for more info about palindromes.*/
public class Qut_05 {

    public static void main(String[] args) {

        System.out.println(isPalindrome (1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;

    }
}
