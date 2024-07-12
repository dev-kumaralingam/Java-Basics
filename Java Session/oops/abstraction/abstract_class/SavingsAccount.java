class SavingsAccount extends Account
{
    double interestRate;

    SavingsAccount(){}
    SavingsAccount(double interestRate, String name, double balance, String accno, String branchCode)
    {
        super(name, balance, accno, branchCode);
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
}