class CurrentAccount extends Account
{
    double creditLimit;

    CurrentAccount(){}
    CurrentAccount(double creditLimit, String name, double balance, String accno, String branchCode)
    {
        super(name, balance, accno, branchCode);
        this.creditLimit = creditLimit;
    }
    public void withdraw(double amount)
    {
        if(this.creditLimit + this.balance >= amount)
        {
               this.balance = this.balance - (amount);
                System.out.println("new balance: "+this.balance);
        }
        else
            System.out.println("Insufficient balance");
    }
    public String getAccountDetails()
    {
        return "Current account["+this.accno+" "+this.name+" "+this.balance+" "+this.branchCode+" "+this.creditLimit+"]";
    }
    public void increaseCreditLimit(double limit)
    {
        this.creditLimit = this.creditLimit + limit;
        System.out.println("New credit limit "+this.creditLimit);

    }
}