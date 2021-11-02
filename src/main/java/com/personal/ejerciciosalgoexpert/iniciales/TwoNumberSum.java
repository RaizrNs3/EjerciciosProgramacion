package com.personal.ejerciciosalgoexpert.iniciales;

import java.util.HashMap;
import java.util.Map;

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

    public static int[] twoNumberSum(int[] array, int targetSum) {
        /* 1) Formar mapa con el array */
        Map<Integer, Integer> mapArr = new HashMap<>();
        int []resp = new int[2];
        for (Integer i : array) {
            mapArr.put(i, i);
        }
        /* 2) Iterar sobre las llaves del mapa con la formula: targetSum - keyArr[n] = elementoEnMapa */
        for(Integer key : mapArr.keySet()){
            int actualAttemp = targetSum - key;
            /* 3) Si el elemento en el mapa no existe incrementar n */
            if(mapArr.containsKey(actualAttemp)){
                resp[0] = key;
                resp[1] = mapArr.get(actualAttemp);
                /* 4) Si el elemento en el mapa si existe retornar el array [keyArr[n], elementoEnMapa] */
                return resp;
            }
        }
        return new int[0];
    }
}
