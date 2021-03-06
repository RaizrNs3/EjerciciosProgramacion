package com.personal.ejerciciosalgoexpert.iniciales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestValueInBSTTest {
    @Test
    public void TestCase1() {
        var root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(13);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(1);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        var expected = 13;
        var actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
        assertEquals(expected, actual);
    }
}