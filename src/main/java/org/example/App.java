package org.example;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        ex8();
    }

    static void ex1() {
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i - 5;
            System.out.println(numbers[i]);
        }
    }

    static void ex2() {
        int[] numbers = new int[] { 45, 23, 7, 54, 9};

        int counter = -5;
        for (int number : numbers) {//enhanced for loop, got att going from top to bottom, no index
            System.out.println(number);
        }
    }

    static void ex3() {
        int[] numbers = new int[] { 45, 23, 7, 54, 9};

        int index = 0;

        while (index < numbers.length) {

            System.out.print(numbers[index++]);

            if(index < numbers.length) {
                System.out.print(',');
            }

        }
    }

    static void ex4() {
        int[] numbers = new int[] { 45, 23, 7, 54, 9};

        //System.out.println(numbers); //will not print its content but the internal address
        System.out.println(Arrays.toString(numbers));
    }

    static void ex5() {
        String[] names = new String[] {"Ulf" , "Jonas" , "Kent"};

        //System.out.println(names); //will not print its content but the internal address
        System.out.println(Arrays.toString(names));
    }

    static void ex6() {
        String name = "Ulf"; //0,1,2

        //char letter = name.charAt(3); //will not work, Exception Index Out Of Bounds
        char letter = name.charAt(2);

        System.out.println(letter);
    }
    static void ex7() {
        char[] name = new char[] {'U','l','f'} ; //0,1,2

        //char letter = name[3]; //will not work, Exception Index Out Of Bounds
        char letter = name[2];

        System.out.println(letter);
    }

    static void ex8() {
        int[][] mutiTable = new int[10][10];

        for (int i = 0; i < mutiTable.length ; i++) {

            for (int j = 0; j < mutiTable[i].length; j++) {

                mutiTable[i][j] = (i + 1) * (j + 1);
                System.out.println("i: " + i + " | j: " + j);
            }
        }

        for (int[] innerArray : mutiTable) {
            System.out.println(Arrays.toString(innerArray));
        }

        System.out.println("5 * 4 = " + mutiTable[5 - 1][4 - 1]); // lookout for the 0 index (-1 to compensate)
    }
}
