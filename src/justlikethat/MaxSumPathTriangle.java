package justlikethat;

import java.util.*;

/**
 * Given a triangular grid of numbers, find the path with max sum starting
 * from the top number.
 * Movement rules: Direct below or diagonally below right
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * That is, 3 + 7 + 4 + 9 = 23.
 */
public class MaxSumPathTriangle {
    static Map<Integer, Integer> sumPathMap = new HashMap<>();
    static int[][] nums = {
            {3},
           {7, 4},
          {2, 4, 6},
         {8, 5, 9, 3}};
    public static void main(String[] args) {
        System.out.println(maxSum(0,0,0));
        System.out.println(sumPathMap);
    }

    static int maxSum(int i, int j, int level) {
        if(i>nums.length-1 || j>nums[i].length-1)
            return 0;

        //tracking elements in path
        Integer max = sumPathMap.get(level);
        if (max==null || max < nums[i][j])
            sumPathMap.put(level, nums[i][j]);

        return nums[i][j] + Math.max(maxSum(i+1, j, level+1), maxSum(i+1, j+1, level+1));
    }
}
