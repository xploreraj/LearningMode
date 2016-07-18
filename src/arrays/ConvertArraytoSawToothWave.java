package arrays;

import java.util.Arrays;

public class ConvertArraytoSawToothWave {
    public void converttoSawToothWave(int A[]){
        for(int i=1; i < A.length; i+=2){
            if(i+1 < A.length){
                swap(A, i, i+1);
            }
        }
    }
    private void swap(int A[],int low,int high){
        int temp = A[low];
        A[low] = A[high];
        A[high] = temp;
    }
    public static void main(String args[]){
        ConvertArraytoSawToothWave convertedArray = new ConvertArraytoSawToothWave();
        int A[] = {0,-6,9,13,10,-1,8,12,54,14,-5};
        Arrays.sort(A);
        convertedArray.converttoSawToothWave(A);
        for(int i=0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
