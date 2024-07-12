import java.util.*;
public class Amstrong {
    public void amstrong(int n){
        int sum=0;
        int k=n;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n=n/10;

        }
        if(sum==k){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not Amstrong Number");
        }
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int n=sc.nextInt();
      sc.close();
      Amstrong obj=new Amstrong();
      obj.amstrong(n); 

    }
}
