package com.matchilling.playground.java;

public class Recursion {

    public static void countDown(int number) {
        if (number > 0) {
            System.out.println(number);
            countDown(number - 1);
        }
    }

    public static void countUp(int number) {
        countUpRecursive(number, 0);
    }

    private static void countUpRecursive(int number, int counter) {
        if (counter < number) {
            System.out.println(++counter);
            countUpRecursive(number, counter);
        }
    }
}
