import java.util.*;

public class Repeated {
  public void repeate(int[] a) {
    int count = 0;
    Arrays.sort(a);
    System.out.println("Repeted values:");

    for (int i = 0; i < a.length - 1; i += count + 1) {
      count = 0;
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          count += 1;

        }

      }
      if (count > 0) {
        System.out.println(a[i]);

      }

    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for(int i=0;i<10;i++){
    System.out.print("Enter a value: ");
    a[i]=sc.nextInt();

    }
    sc.close();
    System.out.println("The Array Values");
    for (int k : a) {
      System.out.print(k);
    }
    System.out.println();
    System.out.println();
    Repeated obj = new Repeated();
    obj.repeate(a);

  }
}
