package com.personal.ejerciciosalgoexpert.iniciales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonConstructibleChangeTest {

    @Test
    public void TestCase1() {
        int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
        int expected = 20;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        int[] input = new int[] {1, 1, 1, 1, 1};
        int expected = 6;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        int[] input = new int[] {1, 5, 1, 1, 1, 10, 15, 20, 100};
        int expected = 55;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        int[] input = new int[] {6, 4, 5, 1, 1, 8, 9};
        int expected = 3;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        int[] input = new int[] {};
        int expected = 1;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        int[] input = new int[] {87};
        int expected = 1;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase7() {
        int[] input = new int[] {5, 6, 1, 1, 2, 3, 4, 9};
        int expected = 32;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase8() {
        int[] input = new int[] {5, 6, 1, 1, 2, 3, 43};
        int expected = 19;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase9() {
        int[] input = new int[] {1, 1};
        int expected = 3;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase10() {
        int[] input = new int[] {2};
        int expected = 1;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase11() {
        int[] input = new int[] {1};
        int expected = 2;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase12() {
        int[] input = new int[] {109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4};
        int expected = 87;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase13() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int expected = 29;
        int actual = NonConstructibleChange.nonConstructibleChange(input);
        assertEquals(expected, actual);
    }
}