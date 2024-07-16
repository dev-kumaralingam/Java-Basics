import java.util.Arrays;
import java.util.Scanner;

public class ArrayCombinationRMduplicate {
   public void removeDub(int[] arr){
        System.out.println("The duplicate removed array:");
        int count;
        for(int i=0;i<arr.length;i+=count){
            count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count==1){
                        System.out.print(arr[i]+" ");
                    }
                }

            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array1 size");
        int size1=sc.nextInt();
        System.out.println("Enter a array2 size");
        int size2=sc.nextInt();
        
        int total=size1+size2;
        int[] arr=new int[total];

        System.out.println("Enter a value for array1");
        for(int i=0;i<size1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a value for array2");
        for(int i=size1;i<total;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();;

        System.out.println("The combined sorted array:");
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        
        }
        System.out.println();
        ArrayCombinationRMduplicate obj=new ArrayCombinationRMduplicate();
        obj.removeDub(arr);


        
    } 
}
