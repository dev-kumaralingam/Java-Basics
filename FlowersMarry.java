import java.util.*;
public class FlowersMarry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of flowers: ");
        int n=sc.nextInt();
        System.out.println("Enter a required size of flowers: ");
        int s=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter a Array values: ");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n-1;i++){
            int k=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println("the flowers are "+arr[i]+", "+arr[j]+" in index "+i+", "+j);
                    k=1;
                    break;
                }
            }
            if(k==1){
                break;
            }
        }
    }
}
