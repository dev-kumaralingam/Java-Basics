import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatVal {
    public void nonrepeate(int[] a) {
        System.out.println("Non repeated Values");
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i += count + 1) {
            count = 0;
            if (i < a.length - 1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
            } else {

                if (a[a.length - 1] == a[a.length - 2]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The Array values");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
        NonRepeatVal obj = new NonRepeatVal();
        obj.nonrepeate(a);
    }
}
