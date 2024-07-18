import java.util.*;
public class ArrayTwoSideBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a array value:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 1; i < size-1; i++) {
            if(arr[i-1] > arr[i] && arr[i] < arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
}
}