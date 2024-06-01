package LinkedLists;

import java.util.LinkedList;

public class DeleteBackHalf {


    static class CustomLinkedList {
        Node head;

        public void displayContents() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println();
        }

        public void deleteBackHalf() {

            if(head == null || head.next == null) {
                head = null;
            }

            Node slow = head;
            Node fast = head;
            Node prev = null;

            while (fast !=null && fast.next != null) {
                fast = fast.next.next;
                prev = slow;
                slow = slow.next;
            }
            prev.next = null;

        }
    }

    static class Node {
        public int data;
        public Node next;

        public Node(int d) {
            data = d;
        }
    }


    public static void main(String[] args) {

        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        linkedList.deleteBackHalf();
        linkedList.displayContents();
    }
}
