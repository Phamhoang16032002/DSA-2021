//package com.company;

import java.util.Scanner;


public class Bai8 {
    private static final Scanner scanner = new Scanner(System.in);

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            //System.out.println(head1.data+" "+head2.data);
            if (head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        if (head1 == null && head2 != null) return false;
        if (head1 != null && head2 == null) return false;
        return true;
    }

    // Complete the compareLists function below.

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for (int j = 1; j <= t; j++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();
            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llistCount1 = scanner.nextInt();

            for (int i = 0; i < llistCount1; i++) {
                int llistItem = scanner.nextInt();
                llist1.insertNode(llistItem);
            }

            int llistCount2 = scanner.nextInt();

            for (int i = 0; i < llistCount2; i++) {
                int llistItem = scanner.nextInt();
                llist2.insertNode(llistItem);
            }
            if (compareLists(llist1.head, llist2.head)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            //printLinkedList(llist1.head);
            //System.out.println();
            //printLinkedList(llist2.head);


        }

        scanner.close();
    }

    static void printLinkedList(SinglyLinkedListNode head) {

        if (head == null) return;
        System.out.println(head.data);
        printLinkedList(head.next);


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

