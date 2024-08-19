import java.util.*;
public class SubTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first value: ");
        int v1=sc.nextInt();
        System.out.println("Enter a second value: ");
        int v2=sc.nextInt();
        sc.close();
        v1=v1-v2;
        System.out.println("Substraction: "+v1);
       
    }
}