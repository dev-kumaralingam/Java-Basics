import java.util.*;

class OddEvenDigitSum {
  
    public int SumDigit(int input1,String input2) {
        int count1 = 0;
        int count2=0;
        while (true) {
            int n = input1 % 10;
            if(n%2!=0){
                count1+=n;
            }else{
                count2+=n;
            }

            input1 = input1 / 10;
            if(input1==0){
                break;
            }
        }
        if(input2.equals("even")){
        return count2;
        }else{
            return count1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value and string: ");
        int input1 = sc.nextInt();
        // System.out.println("Enter a string: ");
        String input2=sc.next();
        OddEvenDigitSum obj = new OddEvenDigitSum();
        int result = obj.SumDigit(input1,input2);
        System.out.println("Sum of  Odd or Even digits : " + result);
    }
}


