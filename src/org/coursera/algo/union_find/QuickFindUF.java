package org.coursera.algo.union_find;

/**
 * Algorithms - Sedgewick\Part I\Week 1 Union-Find
 * Created by rbiswas on 7/7/2014.
 * This program explains Dynamic Connectivity of objects,
 * and we use array as the data structure.
 * This is Quick Find, eager approach.
 * COST MODEL FOR READ AND WRITE
 * Initialize : N
 * UNION : N
 * FIND : 1
 */
public class QuickFindUF {
    public int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for(int i=0; i<n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i=0; i < id.length; i++) {
            if(id[i] == pid)
                id[i] = qid;
        }
    }
}
