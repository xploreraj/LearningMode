package org.algorithms.linkedlist;

/**
 * Created by rbiswas on 3/3/2015.
 */
public class LinkedListCircleDemo {
    public static void main(String[] args) {


        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(head); //circle

        printContents(head);

        head = insertAtEnd(head, new ListNode(10));

        printContents(head);


    }

    static void printContents(ListNode headNode) {
        if (headNode == null) return;
        ListNode currentNode = headNode;
        while(currentNode!=null){
            System.out.print(currentNode.getData() + "->");
            currentNode=currentNode.getNext();
            if (currentNode==headNode)
                break;
        }
        System.out.println(headNode.getData() + " | head");
    }

    static ListNode insertAtEnd(ListNode headNode, ListNode nodeToInsert) {
        ListNode currentNode = headNode;
        ListNode previousNode = headNode;

        if (headNode==null)
            return nodeToInsert;

        while (currentNode!=null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            if (currentNode==headNode)
                break;
        }
        //now currentNode is pointing to headNode
        previousNode.setNext(nodeToInsert);
        nodeToInsert.setNext(headNode);
        return headNode;
    }

}
