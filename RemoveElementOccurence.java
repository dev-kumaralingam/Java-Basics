import java.util.*;
public class RemoveElementOccurence {
    public void remove(int[] arr,int n,int e){
        System.out.print("[ ");
        for(int i=0;i<n;i++){
            if(arr[i]!=e){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.print("]");
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter a array value: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a element for remove: ");
        int e=sc.nextInt();
        sc.close();
        RemoveElementOccurence obj=new RemoveElementOccurence();
        obj.remove(arr,n,e);
    }
}
