package openx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BinaryTreeTest {

    @Test
    public void testCalculateLeavesNumberFromExample() {
        Tree tree = treeFromExample();

        int leavesNumber = tree.calculateLeavesNumber();

        assertEquals(5, leavesNumber);
    }

    @Test
    public void testCalculateLeavesNumberTheRootItself() {
        Tree tree = theRootItself();

        int leavesNumber = tree.calculateLeavesNumber();

        assertEquals(1, leavesNumber);
    }

    @Test
    public void testCalculateLeavesNumberBalanced() {
        Tree tree = balancedBinaryTree();

        int leavesNumber = tree.calculateLeavesNumber();

        assertEquals(4, leavesNumber);
    }

    @Test
    public void testCalculateLeavesNumberUnbalanced() {
        Tree tree = unbalancedBinaryTree();

        int leavesNumber = tree.calculateLeavesNumber();

        assertEquals(4, leavesNumber);
    }

    @Test
    public void testCalculateTheLargestPathFromExample() {
        Tree tree = treeFromExample();

        int largestPath = tree.calculateTheLargestPath();

        assertEquals(4, largestPath);
    }

    @Test
    public void testCalculateTheLargestPathTheRootItself() {
        Tree tree = theRootItself();

        int largestPath = tree.calculateTheLargestPath();

        assertEquals(0, largestPath);
    }

    @Test
    public void testCalculateTheLargestPathBalanced() {
        Tree tree = balancedBinaryTree();

        int largestPath = tree.calculateTheLargestPath();

        assertEquals(2, largestPath);
    }

    @Test
    public void testCalculateTheLargestPathUnbalanced() {
        Tree tree = unbalancedBinaryTree();

        int largestPath = tree.calculateTheLargestPath();

        assertEquals(3, largestPath);
    }

    @Test
    public void testIsTheSameFromExample() {
        Tree tree1 = treeFromExample();
        Tree tree2 = treeFromExample();

        boolean isSame = tree1.isTheSame(tree2);

        assertTrue(isSame);
    }

    @Test
    public void testIsTheSameTheRootItself() {
        Tree tree1 = theRootItself();
        Tree tree2 = theRootItself();

        boolean isSame = tree1.isTheSame(tree2);

        assertTrue(isSame);
    }

    @Test
    public void testIsTheSameBalancedBinaryTree() {
        Tree tree1 = balancedBinaryTree();
        Tree tree2 = balancedBinaryTree();

        boolean isSame = tree1.isTheSame(tree2);

        assertTrue(isSame);
    }

    @Test
    public void testIsNotTheSameSimpleCase() {
        Tree tree1 = theRootItself();
        Tree tree2 = treeFromExample();

        boolean isNotSame = tree1.isTheSame(tree2);

        assertFalse(isNotSame);
    }

    @Test
    public void testIsNotTheSameBalancedAndUnbalanced() {
        Tree tree1 = balancedBinaryTree();
        Tree tree2 = unbalancedBinaryTree();

        boolean isNotSame = tree1.isTheSame(tree2);

        assertFalse(isNotSame);
    }

    @Test
    public void testIsNotTheSameOneValueChanged() {
        Tree tree1 = balancedBinaryTree();
        Tree tree2 = balancedBinaryTreeWithOneValueChanged();

        boolean isNotSame = tree1.isTheSame(tree2);

        assertFalse(isNotSame);
    }

    private static BinaryTree treeFromExample() {
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(3, node1, node2);
        Node node4 = new Node(5);
        Node node5 = new Node(2);
        Node node6 = new Node(8, null, node4);
        Node node7 = new Node(1);
        Node node8 = new Node(0, node5, node6);
        Node node9 = new Node(7, node7, node8);
        Node node10 = new Node(5, node3, node9);

        return new BinaryTree(node10);
    }

    private static BinaryTree theRootItself() {
        return new BinaryTree(new Node(1));
    }

    private static BinaryTree unbalancedBinaryTree() {
        /*        1
         *       / \
         *      2   3
         *     / \
         *    4   5
         *   / \
         *  6   7
         */
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        Node node3 = new Node(4, node1, node2);
        Node node4 = new Node(5);
        Node node5 = new Node(2, node3, node4);
        Node node6 = new Node(3);
        Node node7 = new Node(1, node5, node6);

        return new BinaryTree(node7);
    }

    private static BinaryTree balancedBinaryTree() {
        /*        7
         *     /     \
         *    1       1
         *   / \     / \
         *  2   2   4   4
         */
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(1, node1, node2);
        Node node4 = new Node(4);
        Node node5 = new Node(4);
        Node node6 = new Node(1, node4, node5);
        Node node7 = new Node(7, node3, node6);

        return new BinaryTree(node7);
    }

    private static BinaryTree balancedBinaryTreeWithOneValueChanged() {
        /*        7
         *     /     \
         *    1       1
         *   / \     / \
         *  2   2   3   4
         */
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(1, node1, node2);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(1, node4, node5);
        Node node7 = new Node(7, node3, node6);

        return new BinaryTree(node7);
    }
}
