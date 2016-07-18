package justlikethat;

/**
 * Created by rbiswas on 2/12/2016.
 */
public class HourglassSum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
        int[][] arr2 = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};
        System.out.println(maxHourGlassSum(arr2));
    }

    private static int maxHourGlassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i+2 < 6; i++) //arr.length = 6, fixed
            for (int j=0; j+2 < 6; j++) {
                int top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int middle = arr[i+1][j+1];
                int bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max = Math.max(max, top+middle+bottom);
            }
        return max;
    }
}
