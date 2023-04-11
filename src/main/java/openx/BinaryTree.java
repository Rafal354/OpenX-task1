package openx;

public class BinaryTree implements Tree {
    private final Node root;
    public BinaryTree(Node root) {
        this.root = root;
    }
    public int calculateLeavesNumber() {
        return calculateLeavesNumber(this.root);
    }
    public int calculateTheLargestPath() {
        return calculateTheLargestPath(this.root);
    }
    public boolean isTheSame(Tree other) {
        return isTheSame(this.root, ((BinaryTree) other).root);
    }
    private int calculateLeavesNumber(Node currentNode) {
        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            return 1;
        } else if (currentNode.getLeftChild() == null) {
            return calculateLeavesNumber(currentNode.getRightChild());
        } else if (currentNode.getRightChild() == null) {
            return calculateLeavesNumber(currentNode.getLeftChild());
        } else {
            return calculateLeavesNumber(currentNode.getLeftChild()) +
                    calculateLeavesNumber(currentNode.getRightChild());
        }
    }
    private int calculateTheLargestPath(Node currentNode) {
        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) {
            return 0;
        } else if (currentNode.getLeftChild() == null) {
            return calculateTheLargestPath(currentNode.getRightChild()) + 1;
        } else if (currentNode.getRightChild() == null) {
            return calculateTheLargestPath(currentNode.getLeftChild()) + 1;
        } else {
            return Math.max(calculateTheLargestPath(currentNode.getLeftChild()),
                    calculateTheLargestPath(currentNode.getRightChild())) + 1;
        }
    }
    private boolean isTheSame(Node currentNode1, Node currentNode2) {
        if (currentNode1 == null && currentNode2 == null) {
            return true;
        } else if (currentNode1 == null || currentNode2 == null) {
            return false;
        } else {
            return currentNode1.getValue() == currentNode2.getValue() &&
                    isTheSame(currentNode1.getLeftChild(), currentNode2.getLeftChild()) &&
                    isTheSame(currentNode1.getRightChild(), currentNode2.getRightChild());
        }
    }
}
