package LinkedList;

public class RemoveDuplicates {
    // Inner class representing a node in the linked list
    public static class ListNode {
        int data; // Data stored in the node
        ListNode next, previous; // Pointers to the next and previous nodes

        // Constructor to initialize a node with given data
        ListNode(int data) {
            this.data = data;
            next = null; // Initially, the next node is null
            previous = null; // Initially, the previous node is null
        }
    }

    private static ListNode first, last; // Pointers to the first and last nodes in the list

    /* Function to remove duplicates from a
    sorted doubly linked list */
    public static void removeDuplicates() {
        ListNode n = first; // Start from the first node
        while (n != null) { // Traverse the list
            while (n.next != null && n.next.data == n.data) {
                // If the next node has the same data, remove it from the list
                n.next = n.next.next; // Skip the duplicate node
                if (n.next == null) // If the removed node was the last node, update 'last'
                    last = n;
                else
                    n.next.previous = n; // Update the previous pointer of the next node
            }
            n = n.next; // Move to the next node
        }
    }

    /* Function to insert a node at the beginning
    of the Doubly Linked List */
    public static ListNode push(int data) {
        ListNode newListNode = new ListNode(data); // Create a new node with the given data

        newListNode.previous = null; // Set the previous pointer of the new node to null
        newListNode.next = first; // Set the next pointer of the new node to 'first'

        if (first != null) {
            first.previous = newListNode; // Update the previous pointer of the current first node
        }

        first = newListNode; // Update 'first' to point to the new node
        return first; // Return the updated 'first'
    }

    // Function to print the elements of the list starting from 'first'
    public static void printList(ListNode first) {
        if (first == null)
            System.out.println("Doubly Linked list empty"); // If the list is empty, print a message

        while (first != null) { // Traverse the list and print each node's data
            System.out.print(first.data + " "); // Print the data of the current node
            first = first.next; // Move to the next node
        }
    }

    public static void main(String[] args) {
        // Insert elements into the linked list
        first = push(8);
        first = push(7);
        first = push(4);
        first = push(4);
        first = push(4);
        first = push(3);
        first = push(1);
        first = push(1);

        System.out.println("Original Doubly LinkedList");
        printList(first); // Print the original list

        removeDuplicates(); // Remove duplicates from the list

        System.out.println("\nDoubly linked list after removing duplicates:");
        printList(first); // Print the modified list after removing duplicates
    }
}
