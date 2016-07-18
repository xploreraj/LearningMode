package arrays;

public class SecondMaxNum {
    public static void main(String[] args) {
        int[] arr = {2,1,2,4,1,0,-1,-2};

        int max1 = arr[0];
        int max2 = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }

        if (max1 == max2)
            System.out.println("No 2nd highest element!");
        else
            System.out.println("2nd highest element: " + max2);
    }
}
