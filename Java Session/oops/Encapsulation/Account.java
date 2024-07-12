class Account
{
    private String name;
    private double balance;
    private String accno;
    private String branchCode;

    Account(){}

    Account(String name, double balance, String accno, String branchCode)
    {
        this.name = name;
        this.balance = balance;
        this.accno = accno;
        this.branchCode = branchCode;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void setAccno(String accno)
    {
        this.accno = accno;
    }
    public String getAccno()
    {
        return this.accno;
    }
    public void setBranchCode(String branchCode)
    {
        this.branchCode = branchCode;
    }
    public String getBranchCode()
    {
        return this.branchCode;
    }

    public String toString()
    {
        return "Account["+this.name+" "+this.accno+" "+this.balance+"]";
    }
}