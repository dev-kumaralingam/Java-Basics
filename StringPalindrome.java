import java.util.*;
public class StringPalindrome{
    public void palindrome(String str){
    String str1="";
    for(int i=str.length()-1;i>=0;i--){
        str1=str1+str.charAt(i);
    }
    
    if(str.equals(str1)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check palindrome or not: ");
        String str=sc.nextLine();
        sc.close();
        StringPalindrome obj=new StringPalindrome();
        obj.palindrome(str);


    }
}