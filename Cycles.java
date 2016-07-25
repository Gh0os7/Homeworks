package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dstoykov on 15.7.2016 г..
 */
public class Cycles extends Main{

  protected static void matrixConsoleNumber() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your Number:");
    int N = scanner.nextInt();

    for (int row = 1; row <= N; row++) {
      for (int col = row; col < (row + N); col++) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  private static void scannerArraysAreEqual() {
    Scanner input = new Scanner(System.in);
    int[] arrayOne = new int[5];
    int[] arrayTwo = new int[5];
    System.out.println("Enter the numbers");
    boolean arraysAreEqual = true;

    for (int i = 0; i < arrayOne.length; i++) {
      arrayOne[i] = input.nextInt();
    }
    System.out.println();
    for (int j = 0; j < arrayTwo.length; j++) {
      arrayTwo[j] = input.nextInt();
      if (arrayOne[j] == arrayTwo[j]) {

      } else {
        arraysAreEqual = false;
      }
    }
    System.out.println("Arrays are equal " + arraysAreEqual);

    System.out.println(Arrays.toString(arrayOne));
    System.out.println(Arrays.toString(arrayTwo));
  }

  private static void firstArrayTwentyElements() {
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {

      array[i] = i * 5;

    }
    System.out.println(Arrays.toString(array));
  }

  private static void fibonacci() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number ");
    long N = scanner.nextInt();
    long a = 0;
    long b = 1;

    for (long i = 0; i < N; i++) {

      long result = a + b;
      System.out.println(result);
      a = b;
      b = result;
    }
  }

  private static void cardsCycle() {
    String cardColour1 = "Купа";
    String cardColour2 = "Пика";
    String cardColour3 = "Каро";
    String cardColour4 = "Спатия";
    String type;
    for (int i = 2; i < 15; i++) {
      switch (i) {
        case 11:
          type = "J ";
          break;
        case 12:
          type = "Q ";
          break;
        case 13:
          type = "K ";
          break;
        case 14:
          type = "A ";
          break;
        default:
          type = String.valueOf(i);
      }
      for (int j = 1; j <= 4; j++) {
        switch (j) {
          case 1:
            System.out.println(type + cardColour1);
            break;
          case 2:
            System.out.println(type + cardColour2);
            break;
          case 3:
            System.out.println(type + cardColour3);
            break;
          case 4:
            System.out.println(type + cardColour4);
            break;
        }
      }
      System.out.println();
    }
  }
}
