package Homework_week8;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.*/

public class Readinguserinputchallenge {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        do {
            Scanner inputDataClass = new Scanner(System.in);
            System.out.println("This the #" + count + " Please Enter a number : ");
            int somthing1 = inputDataClass.nextInt();
            boolean hashNextInt = inputDataClass.hasNextInt();
            int sum = somthing1;
            count++;
            if (! hashNextInt) {
                System.out.println("Invalid data type entered");
            }
            System.out.println("The entered number ' sum is : " + sum + "at" + count);
        }
        while (count <= 8);
    }
}