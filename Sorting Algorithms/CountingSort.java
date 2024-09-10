import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        sc.close();

        System.out.println("Original Array:");
        printArray(array);

        countingSort(array, n);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    public static void countingSort(int[] array, int n) {
        int max = getMax(array, n);
        int[] count = new int[max + 1];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    public static int getMax(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
