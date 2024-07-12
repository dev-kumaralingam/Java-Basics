interface AccountOperation
{
    void createAccount(Account acc);
    Account getAccountDetails();
    void withdraw(String accNo, double amount);
    void deposit(String accNo, double amount);
    void getAllAccounts(); 
}