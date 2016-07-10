package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        arrayRepeatedNumber(11);

        }


    protected static void arrayRepeatedNumber (int numberToSearch) {

        int [] array = {11, 22 , 11, 33, 44};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            if (i == numberToSearch) {
                System.out.println("test");
            }
        }







    }








    protected static void englishName (int number) {


        int result = number % 10;


            switch (result) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 0:
                    System.out.println("zero");
                    break;


        }

    }






}
