abstract class Account
{
    String name;
    double balance;
    String accno;
    String branchCode;

    Account(){}
    Account(String name, double balance, String accno, String branchCode)
    {
        this.name = name;
        this.balance = balance;
        this.accno = accno;
        this.branchCode = branchCode;
    }
    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
        System.out.println("new balance: "+this.balance);
    }
    
    public abstract void withdraw(double amount);
    
    public double getBalance()
    {
        return this.balance;
    }

    public abstract String getAccountDetails();
}