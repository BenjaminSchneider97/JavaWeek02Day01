public class BankAccount {

    double accountBalance;
    int accountID;

    public BankAccount(double accountBalance, int accountID){
        this.accountBalance = accountBalance;
        this.accountID = accountID;
    }

    public void addMoney(double money){
        accountBalance += money;
    }

    public void withdrawMoney(double money){
        accountBalance -= money;
    }

    public void getAccountBalance(){
        if(accountBalance < 0){
            System.out.println("You are in minus! New account balance: " + accountBalance);
        } else {
            System.out.println("Account balance after transaction: " + accountBalance);
        }
    }

}
