package org.coursera.algo.union_find;

/**
 * Algorithms - Sedgewick\Part I\Week 1 Union-Find
 * Created by rbiswas on 7/10/2014.
 * This program explains Dynamic Connectivity of objects,
 * and we use array as the data structure.
 * This is Quick Union, lazy approach.
 * Its a tree model and each id element has its root stored.
 * In weighted quick union, we make the root of the smaller tree
 * points to the root of the larger tree.
 *
 * COST MODEL FOR READ AND WRITE
 * Initialize : N
 * UNION : lg(N) (because find the roots has cost N)
 * FIND : lg(N) (in worst case)
 */
public class WeightedQuickUnionUF {
    private int[] id;
    public int[] size;

    public WeightedQuickUnionUF(int n) {
        id = new int[n];
        size = new int[n];
        for(int i=0; i<n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public int root(int p) {
        //traverse to top-most root element and then return it
        while(p != id[p])
            p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i==j) return;

        //check the size and attach the root of the smaller tree below root of big tree
        //so that the distance to any object from the main root node is minimum
        if(size[i] > size[j]) {
            id[j] = i;
            size[i] += size[j];
        }
        else {
            id[i] = j;
            size[j] += size[i];
        }
    }

}
