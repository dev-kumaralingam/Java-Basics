import java.util.*;

public class SearchAlgorithms {

    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == key) {
                return mid;
            }

            
            if (arr[mid] < key) {
                left = mid + 1;
            }
            
            else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Choose the searching algorithm:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int choice = sc.nextInt();

        
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        sc.close();

        
        int result = -1;
        switch (choice) {
            case 1:
                result = linearSearch(arr, key);
                break;
            case 2:
                
                Arrays.sort(arr);
                System.out.println("Sorted array for binary search: " + Arrays.toString(arr));
                result = binarySearch(arr, key);
                break;
            default:
                System.out.println("Invalid choice");
        }

        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

       
    }
}

