class SavingsAccount extends Account
{
    private double interestRate;

    SavingsAccount(){}

    SavingsAccount(double interestRate, String name, double balance, String accno, String branchCode)
    {
        super(name, balance, accno, branchCode);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
    public double getInterestRate()
    {
        return this.interestRate;
    }
    public String toString()
    {
        return "Savings["+this.getName()+" "+this.getAccno()+" "+this.getBalance()+" "+this.getInterestRate()+"]";
    }
}