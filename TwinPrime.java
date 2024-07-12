import java.util.*;
public class TwinPrime {
    int i=0;
    public void twnprime(int n){
    for(i=1;i<n;i+=2){
        if(isprime(i)&&isprime(i+2)){
            System.out.print(i+",");
            System.out.println(i+2);
        }

    }
        
    }
    public static boolean isprime(int i){
    if (i<2){
     return false;
    }
        
    for(int j=2;j<i/2+1;j+=1){
            if(i%j==0)
                return false;
            }
            
    return true;
            
}   


public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter a value: ");
  int n=sc.nextInt();
  sc.close();
  TwinPrime obj=new TwinPrime();
  obj.twnprime(n);

}
    
}
