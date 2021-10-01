import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bai9 {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node) {
        while (node != null) {
           System.out.print(node.data+" ");
            node = node.next;
        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        dummy.next=null;
        SinglyLinkedListNode temp= dummy;

        while(true)
        {

            if(head1==null)
            {    temp.next = head2;
                break;
            }
            else if(head2==null){
                temp.next = head1;
                break;
            }
            else if(head1.data < head2.data)
            {

                temp.next=head1;
                head1=head1.next;

            }

            else{
                temp.next=head2;
                head2=head2.next;

            }
            temp=temp.next;
        }
        return dummy.next;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {

            SinglyLinkedList llist1 = new SinglyLinkedList();
            int llist1Count = scanner.nextInt();
            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();
            int llist2Count = scanner.nextInt();
            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3);
            System.out.println();
        }

        scanner.close();
    }
}
