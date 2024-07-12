import java.util.*;
public class ArrayReverse{
    public void reverse(int[] a){
        int b=a.length;
        // System.out.println("After Reverse");
       
        // for(int i=a.length-1;i>=0;i--){
        //     System.out.print(a[i]+" ");

        // }
        

        for(int i=0;i<(a.length)/2;i++){
            int temp=a[i];
            a[i]= a[b-1-i];
            a[b-1-i]=temp;

        }
        System.out.println("After Sorting");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int s=sc.nextInt();
        System.out.println("Enter a value");
        int[] a=new int[s];
        for(int i=0;i<s;i++){
          a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Before Reverse");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayReverse obj=new ArrayReverse();
        obj.reverse(a);
    }
}