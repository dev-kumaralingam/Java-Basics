import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        float[] array = new float[n];

        System.out.println("Enter the array elements (decimal values):");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextFloat();
        }

        sc.close();

        System.out.println("Original Array:");
        printArray(array);

        bucketSort(array, n);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    @SuppressWarnings("unchecked")
    public static void bucketSort(float[] array, int n) {
        float maxValue = getMax(array);

        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) ((array[i] / maxValue) * (n - 1)); 
            buckets[bucketIndex].add(array[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                array[index++] = value;
            }
        }
    }

    public static float getMax(float[] array) {
        float max = array[0];
        for (float value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void printArray(float[] array) {
        for (float j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
