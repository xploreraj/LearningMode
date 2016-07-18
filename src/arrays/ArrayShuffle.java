package arrays;

/**
 * Created by rbiswas on 6/26/2014.
 */
import java.util.Random;
import java.util.Arrays;

public class ArrayShuffle {
    /**
     * shuffles the elements of the argument int array
     * @param orig
     * @return shuffled int array
     */
    public static int[] shuffle(int[] orig){
        int[] mod = orig.clone();

        Random random = new Random();
        int n = mod.length;

        for(int i=0; i<n; i++){
            int temp, rand = random.nextInt(n);
            temp = mod[i];
            mod[i] = mod[rand];
            mod[rand] = temp;
        }
        return mod;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        int[] mod1 = ArrayShuffle.shuffle(a);
        int[] mod2 = ArrayShuffle.shuffle(a);

        System.out.println(Arrays.toString(mod1));
        System.out.println(Arrays.toString(mod2));
    }
}