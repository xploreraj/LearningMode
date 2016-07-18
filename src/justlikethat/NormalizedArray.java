package justlikethat;

/**
 * Print all contents in an array that might have inner arrays.
 */
public class NormalizedArray {
    public static void main(String[] args) {
        Object[] arr = {1,new Object[]{2,new Object[]{3,4}}, 5, "Hello"};
        printContents(arr);
    }

    static void printContents(Object[] arr) {
        for (Object ele : arr) {
            if(ele instanceof Object[])
                printContents( (Object[]) ele );
            else
                System.out.print(ele + ", ");
        }
    }
}
