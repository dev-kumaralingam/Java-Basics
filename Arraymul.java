import java.util.*;
public class Arraymul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter a array value: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int Mul=1;
        for(int i:arr){
            Mul*=i;
        }
        System.out.println("Multification: "+Mul);
    }
}

