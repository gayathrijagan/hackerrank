package com.ps.easy.linkedlist;

import com.ps.ds.linkedlist.SinglyLinkedList;
import com.ps.ds.linkedlist.SinglyLinkedListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

import static com.ps.easy.linkedlist.PrintLinkedList.printLinkedList;

//https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class DeleteNode {

    public static void main(String[] args) throws IOException {
        SinglyLinkedList list = new SinglyLinkedList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int listCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, listCount).forEach(i -> {
            try {
                int listItem = Integer.parseInt(bufferedReader.readLine().trim());

                list.insertNode(listItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int position = Integer.parseInt(bufferedReader.readLine().trim());

        list.head = deleteNode(list.head, position);
        printLinkedList(list.head);
        bufferedReader.close();
    }

    /**
     * @param list     head of the list
     * @param position index to delete
     * @return head of the list
     */
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode list, int position) {
        if (position == 0) {
            return list.next;
        }

        SinglyLinkedListNode targetNode = list;
        for (int i = 0; i < position - 1; i++) {
            targetNode = targetNode.next;
        }

        targetNode.next = targetNode.next.next;
        return list;
    }
}