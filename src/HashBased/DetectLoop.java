package HashBased;

import java.util.HashSet;

public class DetectLoop {

    static class Answer {

        class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

        static boolean hasCycle(ListNode head) {
            HashSet<ListNode> nodes = new HashSet<>();
            ListNode current = head;

            while(current != null) {
                if(nodes.contains(current)) {
                    return true;
                }
                nodes.add(current);
                current = current.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Answer.ListNode head = answer.new ListNode(1);
        head.next = answer.new ListNode(2);
        head.next.next = answer.new ListNode(3);
        head.next.next.next = head;
        boolean result = Answer.hasCycle(head);
        System.out.println(result);
    }
}
