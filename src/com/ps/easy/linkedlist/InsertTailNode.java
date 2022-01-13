package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.util.Scanner;

import static com.ps.easy.linkedlist.PrintLinkedList.printLinkedList;

public class InsertTailNode {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }
        scanner.close();
        printLinkedList(llist.head);
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode singlyLinkedListNode = new SinglyLinkedListNode(data);

        if (head == null) {
            head = singlyLinkedListNode;
        } else {
            SinglyLinkedListNode lastNode = head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = singlyLinkedListNode;
        }

        return head;
    }

}
