package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.util.Scanner;

import static com.ps.easy.linkedlist.PrintLinkedList.printLinkedList;

//https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
public class InsertHeadNode {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < listCount; i++) {
            int listItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            list.head = insertNodeAtHead(list.head, listItem);
        }
        scanner.close();
        printLinkedList(list.head);
    }

    /**
     * @param list refers to head of the list
     * @param data value to be added at head
     * @return head of the list
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode list, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (list == null) {
            return node;
        } else {
            node.next = list;
            list = node;
            return list;
        }
    }

}
