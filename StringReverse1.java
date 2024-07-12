import java.util.Scanner;

class StringReverse1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String a=sc.nextLine();
for (int i=a.length()-1;i>=0;i--){


System.out.print(a.charAt(i));

}


}
}