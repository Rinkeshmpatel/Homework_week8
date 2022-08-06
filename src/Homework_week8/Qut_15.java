package Homework_week8;

/*15. Display left angle triangle of * using nested for loops */

public class Qut_15 {


    public static void main (String args [])
    {
        int rows = 4;

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}