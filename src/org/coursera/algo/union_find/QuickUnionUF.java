package org.coursera.algo.union_find;

/**
 * Algorithms - Sedgewick\Part I\Week 1 Union-Find
 * Created by rbiswas on 7/8/2014.
 * This program explains Dynamic Connectivity of objects,
 * and we use array as the data structure.
 * This is Quick Union, lazy approach.
 * Its a tree model and each id element has its root stored.
 * COST MODEL FOR READ AND WRITE
 * Initialize : N
 * UNION : N (because find the roots has cost N)
 * FIND : N (in worst case)
 */
public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int n) {
        id = new int[n];
        //set id of each object to itself (N array accesses)
        for(int i=0; i<n; i++)
            id[i] = i;
    }

    //chase parent pointers until reach root
    //depth of i array accesses
    public int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    //check if p and q have same root
    //depth of p and q array accesses
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    //changing root of p pointing to root of q
    //depth of p and q array accesses
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[p] = j;
    }
}