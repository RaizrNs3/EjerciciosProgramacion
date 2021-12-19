package com.personal.ejerciciosalgoexpert.iniciales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BranchSumsTest {
    public static class TestBinaryTree extends BranchSums.BinaryTree {
        TestBinaryTree(int value) {
            super(value);
        }

        TestBinaryTree insert(List<Integer> values) {
            return insert(values, 0);
        }

        TestBinaryTree insert(List<Integer> values, int i) {
            if (i >= values.size()) return null;

            List<TestBinaryTree> queue = new ArrayList<>();
            queue.add(this);
            while (queue.size() > 0) {
                TestBinaryTree current = queue.get(0);
                queue.remove(0);
                if (current.left == null) {
                    current.left = new TestBinaryTree(values.get(i));
                    break;
                }
                queue.add((TestBinaryTree) current.left);
                if (current.right == null) {
                    current.right = new TestBinaryTree(values.get(i));
                    break;
                }
                queue.add((TestBinaryTree) current.right);
            }
            insert(values, i + 1);
            return this;
        }
    }

    @Test
    public void TestCase1() {
        TestBinaryTree tree = new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected = new ArrayList<>(Arrays.asList(15, 16, 18, 10, 11));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase2() {
        TestBinaryTree tree = new TestBinaryTree(1);
        List<Integer> expected = new ArrayList<>(List.of(1));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase3() {
        TestBinaryTree tree = new TestBinaryTree(3);
        List<Integer> expected = new ArrayList<>(List.of(3));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase4() {
        TestBinaryTree tree = new TestBinaryTree(1).insert(Arrays.asList(2, 3));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase5() {
        TestBinaryTree tree = new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 8, 4));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase6() {
        TestBinaryTree tree = new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(15, 16, 18, 9, 11, 11, 11));
        assertEquals(BranchSums.branchSums(tree), expected);
    }

    @Test
    public void TestCase7() {
        /* Custom tree generation */
        BranchSums.BinaryTree rootCase7 = new BranchSums.BinaryTree(0);
        BranchSums.BinaryTree leaf1 = new BranchSums.BinaryTree(1);
        BranchSums.BinaryTree leaf10 = new BranchSums.BinaryTree(10);
        BranchSums.BinaryTree leaf100 = new BranchSums.BinaryTree(100);
        rootCase7.left = leaf1;
        leaf1.left = leaf10;
        leaf10.left = leaf100;

        List<Integer> expected = new ArrayList<>(List.of(111));
        assertEquals(BranchSums.branchSums(rootCase7), expected);
    }

    @Test
    public void TestCase8() {
        /* Custom tree generation */
        BranchSums.BinaryTree rootCase8 = new BranchSums.BinaryTree(0);
        BranchSums.BinaryTree leaf1 = new BranchSums.BinaryTree(1);
        BranchSums.BinaryTree leaf10 = new BranchSums.BinaryTree(10);
        BranchSums.BinaryTree leaf100 = new BranchSums.BinaryTree(100);
        rootCase8.right = leaf1;
        leaf1.right = leaf10;
        leaf10.right = leaf100;
        List<Integer> expected = new ArrayList<>(List.of(111));
        assertEquals(BranchSums.branchSums(rootCase8), expected);
    }

    @Test
    public void TestCase9() {
        BranchSums.BinaryTree rootCase9 = new BranchSums.BinaryTree(0);
        BranchSums.BinaryTree leaf9 = new BranchSums.BinaryTree(9);
        BranchSums.BinaryTree leaf1 = new BranchSums.BinaryTree(1);
        BranchSums.BinaryTree leaf15 = new BranchSums.BinaryTree(15);
        BranchSums.BinaryTree leaf10 = new BranchSums.BinaryTree(10);
        BranchSums.BinaryTree leaf100 = new BranchSums.BinaryTree(100);
        BranchSums.BinaryTree leaf200 = new BranchSums.BinaryTree(200);

        rootCase9.left = leaf9;
        rootCase9.right = leaf1;
        leaf1.left = leaf15;
        leaf1.right = leaf10;
        leaf10.left = leaf100;
        leaf10.right = leaf200;

        List<Integer> expected = new ArrayList<>(Arrays.asList(9, 16, 111, 211));
        assertEquals(BranchSums.branchSums(rootCase9), expected);
    }
}