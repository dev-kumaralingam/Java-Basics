class BankAccount{
    String accountNumber;
    double balance;
    double interestRate;
    BankAccount(){

    }

    BankAccount(String accountNumber, double balance,double interestRate ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate =interestRate;
    }

    public void deposit(double amount){
      this.balance+=amount;
      System.out.println("Amount Successfully Deposited! Balance Amount: "+ this.balance);

    }
}

class SavingsAccount extends BankAccount{
    double minbal;
    SavingsAccount(){

    }
    SavingsAccount(String accountNumber, double d,double e, double minbal){
        super(accountNumber, d, e);
        this.minbal =minbal;
    }
    
    public void withdraw(double amount){
        if(amount<super.balance && this.minbal < super.balance){
            super.balance-=amount;
            System.out.println("Amount Withdraw Successfully!");
            System.out.println("Balance: "+super.balance);
        }
    }

}

public class Bank {
    public static void main(String[] args) {
        
        SavingsAccount obj2=new SavingsAccount("635374",10000.0, 5.0,1000.00);
        
        obj2.deposit(579.99);
        obj2.withdraw(1000.99);

    }
}
