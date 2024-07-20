/*
    input:
        4 2   //first line
        2 3 0 5  //second line
    output:
        3
    Explanation:
        --> The first line first value {N} is size of array.here 4 is size of array
        --> The first line second value {X} is added to all array elements except last value.
        --> Last value of an array is substracted by X.
        --> Return the difference between highest and lowest value of an array.
 */
import java.util.*;
public class ArrayTasksumdiff {
    public int diff(int N,int X,int[] Arr){
        for(int i=0;i<N-1;i++){
            Arr[i]+=X;
        }
        Arr[N-1]-=X;
        Arrays.sort(Arr);
        int dif=Arr[N-1]-Arr[0];
        return dif;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int N=sc.nextInt();
        System.out.println("Enter a value for add and sub: ");
        int X=sc.nextInt();
        System.out.println("Enter a value for array: ");
        int[] Arr=new int[N];
        for(int i=0;i<N;i++){
            Arr[i]=sc.nextInt();
        }
        sc.close();
        ArrayTasksumdiff obj=new ArrayTasksumdiff();
        System.out.println(obj.diff(N, X, Arr));
}
}


