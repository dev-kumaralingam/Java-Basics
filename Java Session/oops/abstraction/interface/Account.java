interface Account //extends NetBanking, MobileBanking
{
    void deposit(double amount);
    
    void withdraw(double amount);
    
    double getBalance();

    String getAccountDetails();

    public void calculateInterest();

    public void increaseCreditLimit(double limit);
}