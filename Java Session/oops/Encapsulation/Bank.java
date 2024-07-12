class Bank implements AccountOperation
{
    Account[] accList;
    private static int index = 0;

    Bank()
    {
        accList = new Account[5];
    }

    public void createAccount(Account acc)
    {
        if(index < accList.length)
            accList[index++] = acc;
    }
    public void getAllAccounts()
    {
        for(int i=0;i<index;i++)
        {
            System.out.println(accList[i]);
        }
    }
    public void deposit(String accNo, double amount)
    {
        Account search = getAccountDetails();
        
        if(search == null)
            System.out.println("Account not found");
        else
            {
                search.setBalance(search.getBalance()+amount);
                System.out.println(search.getBalance());
            }
        
    }
    public Account getAccountDetails()
    {
        Account search = null;
        for(int i=0;i<index;i++)
        {
            if(accList[i].getAccno().equals(accNo))
                search = accList[i];
        }
        return search;
    }
    public void withdraw(String accNo, double amount)
    {
        Account search = getAccountDetails();
        
        if(search == null)
            System.out.println("Account not found");
        else
        {
            if(search instanceof SavingsAccount)
            {
                SavingsAccount savAcc = (SavingsAccount)search;
                if(savAcc.getBalance() > amount)
                    savAcc.setBalance(savAcc.getBalance() - amount);
                else
                    System.out.println("Insufficient balance");

            }
            else if(search instanceof CurrentAccount)
            {
                CurrentAccount currAcc = (CurrentAccount)search;
                if(currAcc.getBalance()+currAcc.getCreditLimit() > amount)
                {
                    currAcc.setBalance(currAcc.getBalance() - amount);
                    if(currAcc.getBalance() < 0)
                        currAcc.setCreditLimit(currAcc.getCreditLimit()+currAcc.getBalance());
                }
                else
                    System.out.println("Insufficient balance");
            }
            else
            {
                System.out.println("Account not found");
            }
        }
    }

}