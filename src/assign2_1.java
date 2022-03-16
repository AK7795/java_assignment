/*Write a java program to print all the prime numbers in
between specific range. Range value should read it from the user */

import java.util.Scanner;

public class assign2_1 {
    public static void main(String[] args) {

        int i ,j ,f;
        System.out.println("enter range starting : ");

        Scanner r1 = new Scanner(System.in);
        int a = r1.nextInt();

        System.out.println("enter range starting : ");
        Scanner r2 = new Scanner(System.in);
        int b = r2.nextInt();

        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);


        for (i = a; i <= b; i++) {
            f=1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    f = 0;
                    break;
                }
                else {f = 1;}
            }


            if (f == 1)
                System.out.println(i);


        }
    }
}