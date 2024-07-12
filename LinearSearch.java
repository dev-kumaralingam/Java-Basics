import java.util.*;
public class LinearSearch {
    public void Search(int element,int[] a){
        for(int i=0;i<a.length;i++){
            if(element==a[i]){
                System.out.println("The "+element+" found at index "+i);
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
    LinearSearch obj=new LinearSearch();
    obj.Search(element, a);
  }  
}
