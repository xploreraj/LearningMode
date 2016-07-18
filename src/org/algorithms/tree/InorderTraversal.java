package org.algorithms.tree;

class BSTNode{
    int leaf;
    static BSTNode root;
    BSTNode left, right;
    BSTNode(int value){
        leaf = value;
    }

    /*
    To check root addition
     */
    public static boolean addFirst(int value) {
        if(root==null) {
            root = new BSTNode(value);
            return true;
        }
        else
            return root.add(value);
    }

    public boolean add(int value) {
        if (value == leaf)
            return false;
        else if (value < leaf) {
            if (left==null) {
                left = new BSTNode(value);
                return true;
            }
            else {
                left.add(value);
            }
        }
        else if (value > leaf) {
            if (right==null) {
                right = new BSTNode(value);
                return true;
            }
            else {
                right.add(value);
            }
        }
        return false;
    }

    public static void traverseInOrder(BSTNode node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(node.leaf);
            traverseInOrder(node.right);
        }
    }

    public static void mirrorTree(BSTNode node) {
        if (node == null)
            return;

        BSTNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirrorTree(node.left);
        mirrorTree(node.right);
    }
}

class Main{
    public static void main(String[] args) {
        BSTNode.addFirst(10);
        BSTNode.addFirst(5);
        BSTNode.addFirst(7);
        BSTNode.addFirst(8);
        BSTNode.addFirst(2);
        BSTNode.traverseInOrder(BSTNode.root);
        BSTNode.mirrorTree(BSTNode.root);
        System.out.println("mirror");
        BSTNode.traverseInOrder(BSTNode.root);
    }
}