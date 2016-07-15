package com.company;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




    }

    // Not perfect one extra column is printed...dunno why.
    private static void matrixConsoleNumber () {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ënter your Number:");
        int N = scanner.nextInt();


        for (int row = 1; row <= N; row++) {
            for (int col = row; col < (row + N); col++) {
                System.out.print(col + "");
            }
            System.out.println(row + "");
//
        }


    }

    private static void factorialMultiplyAndDivide(int N, int K) {


        long factN = 1;
        long factK = 1;
        if (N > K && K > 1) {

            for (int i = 1; i <= N; i++) {
                factN = factN * i;
            }
            for (int j = 1; j <= K; j++) {
                factK = factK * j;

            }
            long result = ((factN * factK) / (factN - factK));
            System.out.println(result);
        } else {
            System.out.println("N should be bigger than K, and K should be more than 1");
        }

    }


    private static void factorialDivide(int N, int K) {

        long factN = 1;
        long factK = 1;
        if (N > K && K > 1) {

            for (int i = 1; i <= N; i++) {
                factN = factN * i;
            }
            for (int j = 1; j <= K; j++) {
                factK = factK * j;

            }
            long result = factN / factK;
            System.out.println(result);
        } else {
            System.out.println("N should be bigger than K, and K should be more than 1");
        }

    }
}




