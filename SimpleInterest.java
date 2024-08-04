import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        int r=sc.nextInt();
        System.out.println("Enter the Number of Years: ");
        int n=sc.nextInt();
        sc.close();
        int si=(p*n*r)/100;
        System.out.println("The simple interest: "+si);

    }
}
