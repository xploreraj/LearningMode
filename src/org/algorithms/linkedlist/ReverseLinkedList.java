package org.algorithms.linkedlist;


public class ReverseLinkedList {

    static Node head;
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printList(head);
        head = reverseRecur(head, null);
        printList(head);
        head = reverseIter(head);
        printList(head);
        //reverseRecur2(head);
        //printList(head);
    }

    private static Node reverseRecur2(Node curr) {
        if(curr.next==null) {
            head = curr;
            return head;
        }
        reverseRecur2(curr.next).next = curr;
        return curr;
    }

    private static Node reverseIter(Node curr) {
        Node next, prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            //prepare for next iteration
            prev = curr;
            curr = next;
        }
        //curr will be null by now, and prev holding first element in reversed order
        return prev;
    }

    private static Node reverseRecur(Node curr, Node prev) {
        if(curr==null){
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        //prev = curr;
        return reverseRecur(next, curr);
    }
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    private static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("x");
    }
}
