import java.util.*;
public class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first value: ");
        int v1=sc.nextInt();
        System.out.println("Enter a second value: ");
        int v2=sc.nextInt();
        sc.close();
        v1=v1+v2;//4+2=6
        v2=v1-v2;//6-2=4
        v1=v1-v2;//6-4=2
        System.out.println("First value after swapping: "+v1);
        System.out.println("Second value after swapping: "+v2);
    }
}