import java.util.*;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is " + ascii);
        System.out.println("Enter a Integer");
        int n = sc.nextInt();
        System.out.println("The ASCII value of " + n + " is " +(char) n );
        sc.close();
        
    }
}
