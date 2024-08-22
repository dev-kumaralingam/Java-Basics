import java.util.*;
public class PrimeNum {
    public int prime(int n){
        if(n<2){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            for(int i=2;i<=n/2+1;i++){
                if(n%i==0){
                    return 0;
                }
            }
            return 1;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range value:");
        int n = sc.nextInt();
        PrimeNum obj=new PrimeNum();
        int Primesum=0;
        int NoPrimeSum=0;
        sc.close();
        for(int i=1;i<=n;i++){
            if(obj.prime(i)==1){
                Primesum+=i;
            }else{
                NoPrimeSum+=i;
            }
        }
        System.out.println("Prime Numbers sum: "+Primesum);
        System.out.println("No Prime Numbers sum: "+NoPrimeSum);
    }
}
