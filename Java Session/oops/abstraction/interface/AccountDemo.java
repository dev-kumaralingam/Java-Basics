import java.util.*;
class AccountDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Current Account\n2.Saving account\n3.get balance\n4.deposit\n5.withdraw\n6.increase credit limit\n7.exit");   
        int n = sc.nextInt();
        Account acc = null;
        while(n>0 && n<7)
        {
            switch(n)
            {
                case 1:
                    acc = new CurrentAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
                break;
                case 2:
                    acc = new SavingsAccount(sc.nextDouble(), sc.next(),sc.nextDouble(),sc.next(),sc.next());
                break;
                case 3:
                    System.out.println("Your balance "+acc.getBalance());
                break;
                case 4:
                    acc.deposit(6000);
                break;
                case 5:
                    acc.withdraw(3000);
                break;
                case 6:
                    acc.increaseCreditLimit(20000);
                break;
                default:
                    System.out.println("Enter correct choice");
                break;
            }
            n = sc.nextInt();
        }
/*
        

        
        */
    }
}