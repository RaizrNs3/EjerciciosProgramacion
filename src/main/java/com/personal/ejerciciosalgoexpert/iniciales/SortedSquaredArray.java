package com.personal.ejerciciosalgoexpert.iniciales;

import java.util.Arrays;

public class SortedSquaredArray {
    /**
     * Write a function that takes in a non-empty array of integers that are sorted in ascending order and returns a new
     * array of the same length with the squares of the original integers also sorted in ascending order.
     * Sample input: array = [1,2,3,5,6,8,9], Sample output: [1, 4, 9, 25, 36, 64, 81] */

    public static int[] sortedSquaredArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.pow(array[i], 2);
        }
        return Arrays.stream(array).sorted().toArray();
    }
}
