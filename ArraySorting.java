import java.util.*;
public class ArraySorting {
    public void sorting(int[] a){
        for(int i=0;i<a.length-1;i++){
            
            for(int j=i+1;j<a.length;j++){
             if(a[i]>a[j]){
                
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
             }

            }
        }
        System.out.println("Array after sorting");
        for(int i:a){
            System.out.print(i+" ");
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int size=sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
        ArraySorting obj=new ArraySorting();
        obj.sorting(a);
    }
}
