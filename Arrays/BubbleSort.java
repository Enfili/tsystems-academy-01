import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100000];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = r.nextInt(100);
        }

        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("bubble sort: "  + (end - start));

        start = System.currentTimeMillis();
        Arrays.sort(arr);
        end = System.currentTimeMillis();
        System.out.println("dual-pivot quicksort sort: "  + (end - start));
    }

    private static void bubbleSort(int[] arr) {
        boolean swap = true;
        int threshold = arr.length - 1;
        while (swap) {
            int cycleEnd = threshold;
            swap = false;
            for (int j = 0; j < cycleEnd; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    swap = true;
                    threshold = j;
                }
            }
        }
    }
}
