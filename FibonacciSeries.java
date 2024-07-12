import java.util.*;
public class FibonacciSeries {
    
    public int fib(int num){
    
    int a=0;
    int b=1;
    System.out.print(a+" "+b);
    int c=0;
    while(num>0){
    c=a+b;
    System.out.print(" "+c);
    a=b;
    b=c;
    num-=1;
    }
    return 1;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    num-=2;
    FibonacciSeries obj=new FibonacciSeries();
    obj.fib( num);
   }
}
