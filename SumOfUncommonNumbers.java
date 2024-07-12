import java.util.HashSet;
import java.util.Set;

public class SumOfUncommonNumbers {

    public static int sumOfUncommonNumbers(int[] arr1, int[] arr2) {
        // Convert arrays to sets to find unique elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        // Find uncommon elements
        Set<Integer> uncommonInArr1 = new HashSet<>(set1);
        uncommonInArr1.removeAll(set2);

        Set<Integer> uncommonInArr2 = new HashSet<>(set2);
        uncommonInArr2.removeAll(set1);

        // Combine the uncommon elements
        uncommonInArr1.addAll(uncommonInArr2);

        // Sum the uncommon elements
        int uncommonSum = 0;
        for (int num : uncommonInArr1) {
            uncommonSum += num;
        }

        // Reduce sum to a single digit
        while (uncommonSum > 9) {
            uncommonSum = sumOfDigits(uncommonSum);
        }

        return uncommonSum;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int result = sumOfUncommonNumbers(arr1, arr2);
        System.out.println("Single digit sum of uncommon numbers: " + result);
    }
}