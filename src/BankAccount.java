/**
 * Created by OliverW on 27/01/2016.
 */
public class BankAccount {
    public String accountName;
    public int balance = 0;
    public String accountEmail;
    public int accountNumber;

    public BankAccount() {
    }

    public void withdrawFunds(int withdrawal){
        if (this.balance>withdrawal){
            System.out.println("Success!, " + withdrawal + " withdrawn from " +
            this.accountName + "'s account");
            balance = this.balance - withdrawal;
        }else{
            System.out.println("Insufficient funds!");
        }
    }

    public void depositFunds(int depositAmount){
        balance = this.balance + depositAmount;
            System.out.println("Success! " + depositAmount
                    + " deposited into " + this.accountName + "'s account");
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }


    public void setAccountEmail(String accountEmail) {

        this.accountEmail = accountEmail;
    }

    public void setAccountName(String accountName) {

        this.accountName = accountName;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void changeName(String accountName){
        this.accountName = accountName;
    }

}
