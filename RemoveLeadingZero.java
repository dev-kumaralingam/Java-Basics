import java.util.*;
public class RemoveLeadingZero {
    public void removeleadzeros(String str){
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                break;
            }
            else {
                continue;
            }
        }
        System.out.println("The Actual Value: ");
        for(int j=i;j<str.length();j++){
            System.out.print(str.charAt(j));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value(with leading zero): ");
        String str=sc.next();
        sc.close();
        RemoveLeadingZero obj=new RemoveLeadingZero();
        obj.removeleadzeros(str);
    }
}
