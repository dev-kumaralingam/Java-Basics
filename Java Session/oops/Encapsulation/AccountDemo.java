import java.util.*;
class AccountDemo
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Account acc;
        while(n>0 && n<8)
        {
            switch(n)
            {
                case 1:
                    acc = new CurrentAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
                    bank.createAccount(acc);
                break;
                case 2:
                    acc = new SavingsAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
                    bank.createAccount(acc);
                break;
                case 3:
                    bank.getAllAccounts();
                break;
                case 4:
                    String accNo = sc.next();
                    double amount = sc.nextDouble();
                    bank.deposit(accNo, amount);
                break;
                case 5:
                    accNo = sc.next();
                    amount = sc.nextDouble();
                    bank.withdraw(accNo, amount);
                break;
                default:
                    System.out.println("enter correct choice");
                break;
            }
            n=sc.nextInt();
        }
    }
}