import java.util.*;
class AccountDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        double balance = sc.nextDouble();
        String accno = sc.next();
        String branchCode = sc.next();

        Account acc = new Account(name, balance, accno, branchCode);
        System.out.println(acc.getAccountDetails());
        
        System.out.println("Balance is: "+acc.getBalance());
        System.out.println(acc.getAccountDetails());

        Account savingsAcc = new Account();
        System.out.println(savingsAcc.getAccountDetails());

        savingsAcc.name = sc.next();
        savingsAcc.balance = sc.nextDouble();
        savingsAcc.accno = sc.next();
        savingsAcc.branchCode = sc.next();
        System.out.println(savingsAcc.getAccountDetails());
        savingsAcc.deposit(4000);
        System.out.println("Balance is: "+savingsAcc.getAccountDetails());
        savingsAcc.withdraw(2000);
        System.out.println("Balance is: "+savingsAcc.getAccountDetails());




    }
}