import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    
   public void Search(int element,int[] a){
    Arrays.sort(a);
    System.out.println("The sorted array");
    for(int i:a){
        System.out.print(i+" ");
    }
    System.out.println();
    int mid=a.length/2;
    if(element>=a[mid]){
        for(int i=mid;i<a.length;i++){
            if(element==a[i]){
                System.out.println("The "+element+" found at index "+i);  
        }
        }
    }else{
         for(int i=0;i<mid;i++){
            if(element==a[i]){
                System.out.println("The "+element+" found at index "+i);  
         }
    }
}
    
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a array size: ");
    int size=sc.nextInt();
    int[] a=new int[size];
    for(int i=0;i<size;i++){
     a[i]=sc.nextInt();
    }
    
    for(int i:a){
        System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("Enter a element to search: ");
    int element=sc.nextInt();
    System.out.println();
    sc.close();
    BinarySearch obj=new BinarySearch();
    obj.Search(element, a);
   
}
}

