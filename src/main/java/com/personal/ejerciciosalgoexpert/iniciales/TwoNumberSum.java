package com.personal.ejerciciosalgoexpert.iniciales;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    /**
     * Ejercicio: Write a function that takes in a non-empty array of distinct integers and an integer representing a
     * target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an
     * array, in any order. If no two numbers sum up tho the target sum, the function should return an empty array.
     * Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single
     * integer to itself in order to obtain the target sum.
     * You can assume that there will be at most one pair of numbers summing up to the target sum.
     * Sample input:
     * array = [3, 5,-4, 8, 11, 1, -1, 6]
     * targetSum = 10
     * Sample output:
     * [-1, 11]
     **/

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        /* O(n) time | O(n) space */
        Set<Integer> nums = new HashSet<>();
        for(int num : array){
            int potentialMatch = targetSum - num;
            if(nums.contains(potentialMatch)){
                return new int[] {potentialMatch, num};
            } else{
                nums.add(num);
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        /* O(nlog(n)) time | O(1) space */
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right){
            int currentSum = array[left] + array[right];
            if(currentSum == targetSum) return new int[]{array[left], array[right]};
            else if(currentSum < targetSum) left++;
            else right--;
        }
        return new int[0];
    }
}
