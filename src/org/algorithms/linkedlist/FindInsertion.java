package org.algorithms.linkedlist;

/**
 * Two singly linked lists meet at a point. Find that point and print.
 */
public class FindInsertion {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        one.next = two; two.next = three; three.next = four; four.next = five; five.next = six;
        printList(one);

        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        ten.next = eleven; eleven.next = twelve; twelve.next = four;
        printList(ten);

        Node pointOfInterection = findInsertionUsingLoop(one, ten);
        System.out.println(pointOfInterection.data);

    }

    private static Node findInsertionUsingLoop(Node head1, Node head2){
        Node curr = head1;
        //find end of first list
        while(curr.next!=null)
            curr = curr.next;

        //point this to head of second list to form loop
        curr.next = head2;

        //put one pointer in loop
        Node temp1 = head1, temp2 = temp1;
        do {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }while(temp1!=temp2);

        //initialize another pointer to beginning and start both one step at a time till they meet
        temp1 = head1;
        do{
            temp1 = temp1.next;
            temp2 = temp2.next;
        }while(temp1!=temp2);



        //at this point temp1 and temp2 should point to same node, and
        //per Floyd's algo, it is the start of loop that we made, or
        //insertion point

        temp1 = head1;
        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        System.out.println(temp1.data + "---> " + temp2.data);

        return temp2;
    }

    private static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("x");
    }
}
