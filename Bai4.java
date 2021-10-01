import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Bai4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printSinglyLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);

        if (position == 0) {
            insertNode.next = llist;
            return insertNode;
        } else {
            SinglyLinkedListNode a = llist;

            for (int i = 0; i < position - 1; i++) {
                if (a.next != null) {
                    a = a.next;
                } else {
                    break;
                }
            }
            //System.out.println(":::"+a.data);
            insertNode.next = a.next;
            a.next = insertNode;
            return llist;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }

        //printSinglyLinkedList(llist.head);

        int data = scanner.nextInt();

        int position = scanner.nextInt();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printSinglyLinkedList(llist_head);
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
