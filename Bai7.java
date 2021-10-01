//package com.company;

import java.util.Scanner;


public class Bai7 {
    private static final Scanner scanner = new Scanner(System.in);

    static void printLinkedList(SinglyLinkedListNode head) {

        if (head == null) return;
        System.out.println(head.data);
        printLinkedList(head.next);
    }

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
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
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        if (llist == null) {
            return null;
        }
        SinglyLinkedListNode node = null;
        while (llist != null) {
            SinglyLinkedListNode a = node;
            node = new SinglyLinkedListNode(llist.data);
            node.next = a;
            llist = llist.next;
        }
        return node;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int j = 1; j <= t; j++) {

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }
            SinglyLinkedListNode llist1 = reverse(llist.head);
            printLinkedList(llist1);
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

