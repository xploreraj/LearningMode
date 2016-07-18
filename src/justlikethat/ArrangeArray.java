package justlikethat;

import java.util.Arrays;

/**
 * Given an input string array with some string values and some empty strings.
 * Arrange the array by putting all empty strings to front of array and
 * push all non empty strings to end, retaining their order.
 * For example, input = {"","","p","","up","","py"}
 * output = {"","","","","p","up","py"}
 */
public class ArrangeArray {
    public static final int findEmptyState(final String[] data, int index, final boolean empty) {
        while (index < data.length && data[index].isEmpty() != empty)
            index++;
        return index;
    }
    public static void arrangeString(String...arr) {
        final int len = arr.length;
        int notEmpty = findEmptyState(arr, 0, false);
        int empty = findEmptyState(arr, notEmpty+1, true);
        while (notEmpty < len && empty < len) {
            String e = arr[empty];
            System.arraycopy(arr, notEmpty, arr, notEmpty+1, empty-notEmpty);
            arr[notEmpty] = e;
            notEmpty = findEmptyState(arr, notEmpty, false);
            empty = findEmptyState(arr, notEmpty+1, true);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"5","","1","2","3","4"}; //fails
        String[] arr2 = {"d","o","g"};
        String[] arr3 = {"","","",""};
        arrangeString(arr);
        arrangeString(arr2);
        arrangeString(arr3);
        System.out.println(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr2));
        System.out.println(Arrays.asList(arr3));
    }
}
