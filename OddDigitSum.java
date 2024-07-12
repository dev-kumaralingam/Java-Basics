import java.util.*;

class OddDigitSum {
  
    public int SumDigit(int input1) {
        int count = 0;
        while (true) {
            int n = input1 % 10;
            if(n%2!=0){
                count+=n;
            }

            input1 = input1 / 10;
            if(input1==0){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int input1 = sc.nextInt();

        OddDigitSum obj = new OddDigitSum();
        int result = obj.SumDigit(input1);
        System.out.println("Sum of  Odd digits : " + result);
    }
}

