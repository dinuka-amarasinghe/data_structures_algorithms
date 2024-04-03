package Trees;

public class TreeEquality {

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while(true) {
            if(value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild =node;
                    break;
                }
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;

            }
        }
    }

    public boolean equals(TreeEquality other) {
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if(first == null && second == null) {
            return true;
        }
        if (first != null && second != null) {
            return first.value == second.value && equals(first.leftChild, second.leftChild) &&
                    equals(first.rightChild, second.rightChild);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeEquality tree = new TreeEquality();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        TreeEquality tree2 = new TreeEquality();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
        System.out.println(tree.equals(tree2));
    }
}