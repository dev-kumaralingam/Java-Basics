class SavingsAccount implements Account
{
    String name;
    double balance;
    String accno;
    String branchCode;
    double interestRate;

    SavingsAccount(){}
    SavingsAccount(double interestRate, String name, double balance, String accno, String branchCode)
    {
        this.name = name;
        this.balance = balance;
        this.accno = accno;
        this.branchCode = branchCode;
        this.interestRate = interestRate;
    }

    public void withdraw(double amount)
    {
        if(this.balance >= amount)
            this.balance = this.balance - (amount);
        else
            System.out.println("Insufficient balance");
    }
    public String getAccountDetails()
    {
        return "Savings account["+this.accno+" "+this.name+" "+this.balance+" "+this.branchCode+" "+this.interestRate+"]";
    }
    public void calculateInterest()
    {
            System.out.println("Interest calculated");
    }
    public void increaseCreditLimit(double limit)
    {
        System.out.println("No credit limit");

    }
    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
        System.out.println("new balance: "+this.balance);
    }
    public double getBalance()
    {
        return this.balance;
    }
}