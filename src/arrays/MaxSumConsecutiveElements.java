package arrays;

/**
 * Find the maximum sum of consecutive elements in an array
 */
public class MaxSumConsecutiveElements {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-6,-8};
        System.out.println("Max contiguous elements' sum is: " + maxSum(arr));
    }

    private static int maxSum(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }


}
