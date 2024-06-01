package LinkedLists;

public class LinkedListSum {

    static class Answer {
        class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }

            @Override
            public String toString() {
                return Integer.toString(val);
            }
        }

        static int sum(ListNode head) {
            int sum = 0;
            ListNode current = head;
            while (current != null) {
                sum+=current.val;
                current = current.next;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Answer.ListNode head = answer.new ListNode(7);
        head.next = answer.new ListNode(5);
        head.next.next = answer.new ListNode(3);
        head.next.next.next = answer.new ListNode(4);
        head.next.next.next.next = answer.new ListNode(1);
        int result = Answer.sum(head);
    }
}
