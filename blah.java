package com.company;

import java.util.Arrays;

public class blah {

    public static void main(String[] args) {



        factorial(22);

    }


    private static void factorial (int n) {

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

            System.out.println(fact);
        }

    }




    private static void reverseNumbers (int value) {

        int resultNumber = 0;
        for(int i = value; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;

        }
        System.out.println(resultNumber);

    }






    // NOT WORKING!
    private static void arrayRepeatedNumber() {

        int[] array = {1,2,3,5,3,};
        int numberToSearch = 3;
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            if (i == numberToSearch) {
                System.out.println("test");

            }
        }
    }








    private static void englishName (int number) {


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
