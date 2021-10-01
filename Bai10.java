import java.io.BufferedWriter;
import java.util.Scanner;

public class Bai10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {

        SinglyLinkedListNode fast = llist;
        SinglyLinkedListNode slow = llist;

        int pos = 0;
        while (pos < positionFromTail) {
            fast = fast.next;
            pos++;
        }

        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;

    }

    /*
     * Complete the 'getNode' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER positionFromTail
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static void main(String[] args) {

        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {

            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            int position = scanner.nextInt();
            int result = getNode(llist.head, position);

            System.out.println(result);
        }
        scanner.close();
    }

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }
}
