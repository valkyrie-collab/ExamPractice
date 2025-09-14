package com.valkyrie.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    private static final Scanner sc = new Scanner(System.in);

    public static void doFibonacci() {
        System.out.print("Enter the First Number: ");
        int numberOne = sc.nextInt();

        System.out.print("\nEnter the Second Number: ");
        int numberTwo = sc.nextInt();

        System.out.print("\nEnter the range of the series: ");
        int range = sc.nextInt();

        System.out.print(numberOne + ", " + numberTwo + ", ");

        for (int i = 0; i < range - 1; i++) {
            numberTwo = numberOne + numberTwo;
            numberOne = numberTwo - numberOne;
            System.out.print(numberTwo + ", ");
        }

        System.out.println(numberOne + numberTwo);
    }
}
