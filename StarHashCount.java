import java.util.*;
public class StarHashCount {
    public void symbolcount(String str){
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                count1++;
            }else if(str.charAt(i)=='#'){
                count2++;
            }
        }
        System.out.println("The number of * is "+count1);
        System.out.println("The number of # is "+count2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value to count * and # : ");
        String str = sc.nextLine();
        sc.close();
        StarHashCount obj=new StarHashCount();
        obj.symbolcount(str);
    }
}
