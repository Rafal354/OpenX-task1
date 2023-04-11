package openx;

public class Main {
    public static void main(String[] args) {
        Tree tree = new BinaryTree(new Node(5, new Node(3, new Node(2), new Node(5)),
                new Node(7, new Node(1), new Node(0, new Node(2),
                        new Node(8, null, new Node(5))))));
        System.out.println(tree.calculateLeavesNumber());
        System.out.println(tree.calculateTheLargestPath());
        System.out.println(tree.isTheSame(tree));
    }
}
