package com.personal.ejerciciosalgoexpert.arrays.iniciales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeNumberSumTest {
    private boolean compare(List<Integer[]> triplets1, List<Integer[]> triplets2) {
        if (triplets1.size() != triplets2.size()) return false;
        for (int i = 0; i < triplets1.size(); i++) {
            if (!Arrays.equals(triplets1.get(i), triplets2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-8, 2, 6});
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 1, 5});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase2() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {1, 2, 3});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3}, 6);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase3() {
        List<Integer[]> expected = new ArrayList<>();
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3}, 7);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase4() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-2, 10, 49});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {8, 10, -2, 49, 14}, 57);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase5() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 1, 5});
        expected.add(new Integer[] {-1, 0, 1});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, 0, -8, -1}, 0);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase6() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-8, 2, 6});
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 0, 6});
        expected.add(new Integer[] {-6, 1, 5});
        expected.add(new Integer[] {-1, 0, 1});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, 0, -8, -1, 6}, 0);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase7() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-8, 2, 6});
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 0, 6});

        expected.add(new Integer[] {-6, 1, 5});
        expected.add(new Integer[] {-5, -1, 6});
        expected.add(new Integer[] {-5, 0, 5});

        expected.add(new Integer[] {-5, 2, 3});
        expected.add(new Integer[] {-1, 0, 1});

        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, 0, -8, -1, 6, -5}, 0);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase8() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {1, 2, 15});
        expected.add(new Integer[] {1, 8, 9});
        expected.add(new Integer[] {2, 7, 9});
        expected.add(new Integer[] {3, 6, 9});
        expected.add(new Integer[] {3, 7, 8});
        expected.add(new Integer[] {4, 5, 9});
        expected.add(new Integer[] {4, 6, 8});
        expected.add(new Integer[] {5, 6, 7});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase9() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {8, 9, 15});
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 32);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase10() {
        List<Integer[]> expected = new ArrayList<>();
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 33);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase11() {
        List<Integer[]> expected = new ArrayList<>();
        List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 5);
        assertTrue(this.compare(output, expected));
    }
}