import java.util.*;

class DigitSum {
  
    public int SumDigit(int input1) {
        int count = 0;
        while (true) {
            int n = input1 % 10;
            count += n;
            input1 = input1 / 10;
            if (input1 == 0) {
                if (count < 10 && count > -10) {
                    break;
                }
                input1 = count;
                count = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int input1 = sc.nextInt();

        DigitSum obj = new DigitSum();
        int result = obj.SumDigit(input1);
        System.out.println("Sum of digits until single digit: " + result);
    }
}
