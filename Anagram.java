import java.util.*;
public class Anagram {
    public void checkAnagram(String str1,String str2){
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();
         char[] ch1=str1.toCharArray();
         char[] ch2=str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
        boolean val=Arrays.equals(ch1,ch2);
        if(str1.length()==str2.length()){
            if(val==true){
                System.out.println("Strings are anagram");
            }else{
                System.out.println("Strings are not anagram");
            }
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check Anagram or not!...");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        sc.close();
        Anagram obj=new Anagram();
        obj.checkAnagram(str1,str2);
    }
    
}
