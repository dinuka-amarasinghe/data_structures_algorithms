package Trees;

import java.util.ArrayList;

public class TraverseLevelOrder {

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

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        if(root.leftChild == null && root.rightChild == null) {
            return 0;
        }
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        ArrayList<Integer> list = new ArrayList<>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        if(distance==0) {
            list.add(root.value);
            return;
        }
        getNodesAtDistance(root.leftChild, distance -  1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }


    public void traverseLevelOrder() {
        for(var i = 0; i <= height(); i++) {
            //TODO understand how this loop works
            for(var value:getNodesAtDistance(i)) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        TraverseLevelOrder tree = new TraverseLevelOrder();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.traverseLevelOrder();
    }
}