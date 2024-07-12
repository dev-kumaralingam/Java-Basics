import java.util.*;
public class Pattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value: ");
       int n=sc.nextInt(); 
       sc.close();

       System.out.println("Full Pyramid");
       int a=n-1;
      
       for(int i=0;i<n;i++){

        for(int j=0;j<a;j++){
            System.out.print(" ");
        }
        for(int k=a;k<n;k++){
            System.out.print("* ");
        }
        a--;
        System.out.println();
       }


       System.out.println("Left Half Pyramid");
       int b=n-1;
      
       for(int i=0;i<n;i++){

        for(int j=0;j<b;j++){
            System.out.print(" ");
        }
        for(int k=b;k<n;k++){
            System.out.print("*");
        }
        b--;
        System.out.println();
       }

       System.out.println("Right Half Pyramid");
    
       for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
        }




       System.out.println("Inverted Right Half Pyramid");
       int d=n-1;
      
       for(int i=0;i<n;i++){

        for(int j=0;j<=d;j++){
            System.out.print("*");
        }
        for(int k=d;k<n;k++){
            System.out.print(" ");
        }
        d--;
        System.out.println();
    
        }

        System.out.println("Inverted Left Half Pyramid");
        int e=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=e;k++){
                System.out.print("*");
            }
            e--;
            System.out.println();
        }
        
        System.out.println("Inverted Pyramid");
        int f=n-1;
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=f;j++){
                System.out.print("* ");
            }
            f--;
            System.out.println();
        }

        System.out.println("Hallow Square");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("Hourglass Pattern");
        int g=n-1;
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=g;j++){
                System.out.print("* ");
            }
            g--;
            System.out.println();
        }
        int h=n-2;
      
       for(int i=0;i<n-1;i++){

        for(int j=0;j<h;j++){
            System.out.print(" ");
        }
        for(int k=h;k<n;k++){
            System.out.print("* ");
        }
        h--;
        System.out.println();
       }

       System.out.println("Diamond Pattern");
       int l=n-1;
      
       for(int i=0;i<n;i++){

        for(int j=0;j<l;j++){
            System.out.print(" ");
        }
        for(int k=l;k<n;k++){
            System.out.print("* ");
        }
        l--;
        System.out.println();
       }
       int m=n-2;
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=m;j++){
                System.out.print("* ");
            }
            m--;
            System.out.println();
        }
    
    }
}
