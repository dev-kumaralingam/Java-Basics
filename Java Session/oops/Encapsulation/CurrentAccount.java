class CurrentAccount extends Account
{
    private double creditLimit;

    CurrentAccount(){}

    CurrentAccount(double creditLimit, String name, double balance, String accno, String branchCode)
    {
        super(name, balance, accno, branchCode);
        this.creditLimit = creditLimit;
    }

    public void setCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    public String toString()
    {
        return "Current["+this.getName()+" "+this.getAccno()+" "+this.getBalance()+" "+this.getCreditLimit()+"]";
    }
}