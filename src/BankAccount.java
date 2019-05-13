public class BankAccount {

    double accountBalance;
    int accountID;

    public BankAccount(double accountBalance, int accountID){
        this.accountBalance = accountBalance;
        this.accountID = accountID;
    }

    public void addMoney(double money){
        if(money < 0){
            System.out.println("You can't add negative numbers to your bank account!");
        } else {
            accountBalance += money;
        }
    }

    public void withdrawMoney(double money){
        if (accountBalance < money) {
            System.out.println("insufficient account balance, can't withdraw money!");
        } else {
            accountBalance -= money;
        }

    }

    public void getAccountBalance(){
        if(accountBalance < 0){
            System.out.println("You are in minus! New account balance: " + accountBalance);
        } else {
            System.out.println("Account balance after transaction: " + accountBalance);
        }

    }

}
