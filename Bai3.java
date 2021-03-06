 //package com.company;

 import java.io.*;
 import java.math.*;
 import java.security.*;
 import java.text.*;
 import java.util.*;
 import java.util.concurrent.*;
 import java.util.regex.*;
 import java.util.Scanner;

 public class Bai3 {

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

 public SinglyLinkedList() {
 this.head = null;
 }

 }

 static void printSinglyLinkedList(SinglyLinkedListNode head) {

 if(head == null) return;
 System.out.println(head.data);
 printSinglyLinkedList(head.next);


 }

 // Complete the insertNodeAtHeadfunction below.

 /*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */

 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
 SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
 insertNode.next=llist;
 return insertNode;
 }

 private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {

 SinglyLinkedList llist = new SinglyLinkedList();

 int llistCount = scanner.nextInt();

 for (int i = 0; i < llistCount; i++) {

 int llistItem = scanner.nextInt();
 SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
 llist.head = llist_head;

 }

 printSinglyLinkedList(llist.head);
 scanner.close();
 }
 }

