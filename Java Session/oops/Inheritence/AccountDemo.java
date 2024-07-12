import java.util.Scanner;
class AccountDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CuurentAccount currAcc = new CuurentAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
        currAcc.withdraw(200000);
        System.out.println(currAcc.getAccountDetails());   
        currAcc.deposit(20000);     
        currAcc.increaseCreditLimit(20000);
        System.out.println(currAcc.getAccountDetails());
        
        Account acc = new CuurentAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
        acc.withdraw(200000);
        System.out.println(acc.getAccountDetails());   
        acc.deposit(20000);     
        acc.increaseCreditLimit(20000);
        System.out.println(acc.getAccountDetails());
    }
}