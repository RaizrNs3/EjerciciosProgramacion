package com.personal.ejerciciosalgoexpert.arrays.iniciales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeNumberSum {
    /**
     * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
     * The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array
     * of all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves
     * should be ordered in ascending order with respect to the numbers they hold.
     * If no three numbers sum up to the target sum, the function should return an empty array.
     * Sample Input
     * array = [12, 3, 1, 2, -6, 5, -8, 6]
     * targetSum = 0
     * Sample Output
     * [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]*/

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);


        List<Integer> orderedArrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer[]> tripletsList = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                Integer[] tmpArray = new Integer[3];
                int tmpSum = array[i] + array[j];
                int x = targetSum - tmpSum;
                if (orderedArrayList.contains(x)) {
                    tmpArray[0] = array[i];
                    tmpArray[1] = array[j];
                    tmpArray[2] = x;
                    Arrays.sort(tmpArray);
                    if (!containsSubArray(tripletsList, tmpArray) && x != array[i] && x != array[j]) {
                        tripletsList.add(tmpArray);
                    }
                }
            }
        }

        return tripletsList;

    }

    public static boolean containsSubArray(List<Integer[]> tripletsList, Integer[] tmpArray) {
        for (Integer[] arr : tripletsList ) {
            if (Arrays.equals(arr, tmpArray)) {
                return true;
            }
        }
        return false;
    }

}
