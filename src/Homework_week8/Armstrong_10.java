package Homework_week8;

/*Qut 10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)*/

import java.util.Scanner;

public class Armstrong_10 {

    int a,b,c,d;
    void test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        b= sc.nextInt();
    }

    void test2()
    {
        c = 0;
        d = 0;
        a= b;
        while (a>0)
        {
            c++;
            a/=10;
        }
        a=b;
        while (b>0)
        {
            d = (int)(d+Math.pow(b%10,c));
            b= b/10;
        }
        if(a==d)
            System.out.println("It is  a Armstrong Number ");
        else
            System.out.println("It is not a an Armstrong Number ");
    }

    public static void main(String[] args) {
        Armstrong_10 n = new Armstrong_10();
        n.test();
        n.test2();
    }
}