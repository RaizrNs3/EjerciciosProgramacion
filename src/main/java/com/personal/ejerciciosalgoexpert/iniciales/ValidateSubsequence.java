package com.personal.ejerciciosalgoexpert.iniciales;

import java.util.List;
import java.util.Objects;

public class ValidateSubsequence {
    /**
     * Given a two non-empty arrays of integers, write a function that determines wheter the second array is a subsequence
     * of the first one.
     * A subsequence of an array is a set of numbers that aren't nesessarily adjacent in the array but that are in the
     * same order as they appear in the array. For instance the numbers [1,3,4] form a subsequence of the array [1,2,3,4],
     * and so do the numbers [2,4]. Note that a single number in an array and the array itself are both valid subsequences
     * of the array.
     * Sample input:
     * array = [5,1,22,25,6,-1,8,10]
     * sequence = [1,6,-1,10]
     * Sample output = true */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int lenSequence = sequence.size();
        int lenArray = array.size();
        int indexSequence = 0;
        int indexArray = 0;
        while(indexArray < lenArray){
            if(Objects.equals(sequence.get(indexSequence), array.get(indexArray))){
                indexSequence++;
            }
            indexArray++;
            if(indexSequence == lenSequence) return true;
        }
        return false;
    }
}
