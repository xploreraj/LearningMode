package org.algorithms.linkedlist;

/**
 * Created by rbiswas on 3/3/2015.
 */
public class SingleLinkedListInsertDemo {

    public static void main(String[] args) {
        ListNode headNode = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        headNode.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println("-------------traverse and length---------------");
        traverse(headNode); //traverse
        System.out.println("length: " + listLength(headNode));

        System.out.println("--------------insert at beginning--------------");
        headNode = insertAtBeginning(headNode, new ListNode(1));
        traverse(headNode);

        System.out.println("--------------insert at end--------------");
        headNode = insertAtEnd(headNode, new ListNode(6));
        traverse(headNode);

        System.out.println("--------------insert at middle--------------");
        headNode = insertAtMiddle(headNode, new ListNode(11), 7);
        traverse(headNode);
    }

    /*
    * Complexity:
    * Time - O(n); Space - O(1) for temp variable
    */
    static int listLength(ListNode headNode){
        int length=0;
        ListNode currentNode = headNode;
        while(currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    /*
     * traverse the list and print elements
     */
    static void traverse(ListNode headNode){
        ListNode currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
            //check circular condition
            if (currentNode==headNode)
                break;
        }
    }

    /*
     * insert at beginning
     */
    static ListNode insertAtBeginning(ListNode headNode, ListNode nodeToInsert) {
        if (headNode == null) {
            return nodeToInsert;
        }
        nodeToInsert.setNext(headNode);
        headNode = nodeToInsert;
        return headNode;
    }

    /*
    * insert at end
    */
    static ListNode insertAtEnd(ListNode headNode, ListNode nodeToInsert) {
        if (headNode == null) {
            return nodeToInsert;
        }
        ListNode currentNode = headNode;
        while (currentNode.getNext()!=null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(nodeToInsert);
        return headNode;
    }

    /*
     * insert at middle
     * @return headNode
     */
    static ListNode insertAtMiddle(ListNode headNode, ListNode nodeToInsert, int position) {
        if (headNode == null) {
            return nodeToInsert;
        }
        int size = listLength(headNode);
        if (position < 1 || position > size+1) {
            System.out.println("Invalid position. Allowed positions are 1 to " + (size+1));
            return headNode;
        }
        if (position == 1) {
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        }

        ListNode previousNode = headNode;
        int count=1;
        while(count < position-1) {
            previousNode = previousNode.getNext();
            count++;
        }
        //now previousNode points to the element before position to insert
        nodeToInsert.setNext(previousNode.getNext());
        previousNode.setNext(nodeToInsert);
        return headNode;
    }
}
