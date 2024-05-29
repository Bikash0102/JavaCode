/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
 

import java.util.Scanner;

public class Dimond

{

    public static void main(String args[]) 

    {

        int n, i, j, space = 1;

        System.out.print("Enter the number of rows: ");

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        space = n - 1;

        for (j = 1; j <= n; j++) 

        {

            for (i = 1; i <= space; i++) 

            {

                System.out.print(" ");

            }

            space--;

            for (i = 1; i <= 2 * j - 1; i++) 

            {

                System.out.print("*");                

            }

            System.out.println("");

        }

        space = 1;

        for (j = 1; j <= n - 1; j++) 

        {

            for (i = 1; i <= space; i++) 

            {

                System.out.print(" ");

            }

            space++;

            for (i = 1; i <= 2 * (n - j) - 1; i++) 

            {

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}
