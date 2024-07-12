class CuurentAccount extends Account
{
    double creditLimit;

    CuurentAccount()
    {    }
    CuurentAccount(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    CuurentAccount(double creditLimit, String name, double balance, String accno, String branchCode)
    {
        super(name, balance, accno, branchCode);
        this.creditLimit = creditLimit;
    }

    public void withdraw(double amount)
    {
        if((this.creditLimit + this.balance) >= amount)
            this.balance = this.balance - amount;
        else
            System.out.println("insufficient balance");
    }
    public String getAccountDetails()
    {
        return super.getAccountDetails()+" "+this.creditLimit;
    }
    public void increaseCreditLimit(double newCreditLimit)
    {
        this.creditLimit = this.creditLimit + newCreditLimit;
    }
    public void increaseCreditLimit(int newCreditLimit, double maxCreditLimit)
    {
        this.creditLimit = this.creditLimit + newCreditLimit;
    }
}