class Account
{
    String name;
    double balance;
    String accno;
    String branchCode;

    Account()
    {
        this("mano",7899,"7578655","rt5675");
        System.out.println("default constructor");
    }

    Account(String name, double balance, String accno, String branchCode)
    {
        
        this.name = name;
        this.balance = balance;
        this.accno = accno;
        this.branchCode = branchCode;
    }
    Account(String name, double balance, String accno){}

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }
    public void withdraw(double amount)
    {
        if(amount<=this.balance)
            this.balance = this.balance - amount;
    }
    public void transfer(String accno, double amount)
    {
        if(amount<=this.balance)
            this.balance = this.balance - amount;
    }
    public double getBalance()
    {
        return this.balance;        
    }
    public String getAccountDetails()
    {
        return this.accno+" "+this.name+" "+this.balance+" "+this.branchCode;
    }
}