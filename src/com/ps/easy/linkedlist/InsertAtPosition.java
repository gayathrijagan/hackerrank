package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.util.Scanner;

import static com.ps.easy.linkedlist.PrintLinkedList.printLinkedList;

//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertAtPosition {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < listCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            list.insertNode(llistItem);
        }

        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        list.head = insertNodeAtPosition(list.head, data, position);
        scanner.close();
        printLinkedList(list.head);
    }

    /**
     * @param list     head of the list
     * @param data     value to be added in the list
     * @param position position of the value to be added
     * @return head of the list
     */
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode list, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (list == null) {
            return node;
        }

        SinglyLinkedListNode desiredNode = list;
        for (int i = 0; i < position - 1; i++) {
            desiredNode = desiredNode.next;
        }

        node.next = desiredNode.next;
        desiredNode.next = node;
        return list;
    }
}
