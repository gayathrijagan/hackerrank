package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.util.Scanner;

import static com.ps.easy.linkedlist.PrintLinkedList.printLinkedList;

public class InsertTailNode {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < listCount; i++) {
            int listItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            list.head = insertNodeAtTail(list.head, listItem);
        }
        scanner.close();
        printLinkedList(list.head);
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
