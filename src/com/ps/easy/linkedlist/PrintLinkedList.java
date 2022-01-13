package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.util.Scanner;

public class PrintLinkedList {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < listCount; i++) {
            int listItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            list.insertNode(listItem);
        }

        printLinkedList(list.head);

        scanner.close();
    }

    public static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
