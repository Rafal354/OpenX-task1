package openx;

public class Node {
    private final int value;
    private final Node leftChild;
    private final Node rightChild;

    Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
