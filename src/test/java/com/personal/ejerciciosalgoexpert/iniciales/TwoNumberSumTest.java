package com.personal.ejerciciosalgoexpert.iniciales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {
    /**
     * Test del ejercicio TwoNumberSumTest
     * @author Daniel López */

    @Test
    public void testCase1(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    public void testCase2(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6}, 10);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 6));
    }

    @Test
    public void testCase3(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1}, 5);
        assertEquals(2, output.length);
        assertTrue(contains(output, 4));
        assertTrue(contains(output, 1));
    }

    @Test
    public void testCase4(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1, -3}, 3);
        assertEquals(2, output.length);
        assertTrue(contains(output, 6));
        assertTrue(contains(output, -3));
    }

    @Test
    public void testCase5(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        assertEquals(2, output.length);
        assertTrue(contains(output, 8));
        assertTrue(contains(output, 9));
    }

    @Test
    public void testCase6(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertEquals(2, output.length);
        assertTrue(contains(output, 3));
        assertTrue(contains(output, 15));
    }

    @Test
    public void testCase7(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        assertEquals(2, output.length);
        assertTrue(contains(output, -5));
        assertTrue(contains(output, 0));
    }

    @Test
    public void testCase8(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        assertEquals(2, output.length);
        assertTrue(contains(output, 210));
        assertTrue(contains(output, -47));
    }

    @Test
    public void testCase9(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        assertEquals(0, output.length);
    }

    @Test
    public void testCase10(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testCase11(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {14}, 15);
        assertEquals(0, output.length);
    }

    @Test
    public void testCase12(){
        int[] output = TwoNumberSum.twoNumberSum(new int[] {15}, 15);
        assertEquals(0, output.length);
    }

    private boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}