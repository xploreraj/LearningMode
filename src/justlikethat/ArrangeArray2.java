package justlikethat;

import java.util.Arrays;

/**
 * Given an input string array with some string values and some empty strings.
 * Arrange the array by putting all empty strings to front of array and
 * push all non empty strings to end, retaining their order.
 * For example, input = {"","","p","","up","","py"}
 * output = {"","","","","p","up","py"}
 */
public class ArrangeArray2 {
    public static String[] arrangeString(String...arr) {
        int len = arr.length;
        String[] temp = new String[len];

        for (int i=0, t1=0, j=len-1, t2=len-1; i<len && j>=0; i++, j--) {
            if(arr[i].equals("")) {
                temp[t1++] = arr[i];
            }
            if(!arr[j].equals("")) {
                temp[t2--] = arr[j];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String[] arr = {"","a","","d","","o","","g",""};
        String[] arr2 = {"d","o","g"};
        String[] arr3 = {"","","",""};

        System.out.println(Arrays.asList(arrangeString(arr)));
        System.out.println(Arrays.asList(arrangeString(arr2)));
        System.out.println(Arrays.asList(arrangeString(arr3)));
    }
}
