package third_task;

import java.util.Arrays;
import java.util.Random;

public class generic {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array = new int[(int) (Math.random() * 20)];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("   Random array (Math.random): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("   Sorted random array (Math.random): " + Arrays.toString(array));

        Random random = new Random();
        array = new int[(int) (random.nextInt(20))];
        for (int i =0; i < array.length; i++){
            array[i] = (int) (random.nextInt(100));
        }

        System.out.println("   Random array (Random): " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("   Sorted random array (Random): " + Arrays.toString(array));
    }
}
