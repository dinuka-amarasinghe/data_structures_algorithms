package Trees;

import java.util.ArrayList;

public class NodesAtDistance {

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

    public static void main(String[] args) {
        NodesAtDistance tree = new NodesAtDistance();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        var list = (tree.getNodesAtDistance(1));
        for (var item: list) {
            System.out.println(item);
        }
    }
}