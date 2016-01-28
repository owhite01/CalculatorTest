/**
 * Created by OliverW on 27/01/2016.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount timsAccount = new BankAccount();
        BankAccount olliesAccount = new BankAccount();
        StudentAccount myAccount = new StudentAccount();

        timsAccount.setAccountName("Tim");
        timsAccount.setAccountEmail("Tim@email.com");
        timsAccount.getBalance();


        olliesAccount.setAccountName("Ollie");
        olliesAccount.setAccountEmail("Ollie@email.com");
        olliesAccount.getBalance();

        myAccount.setUniversity("Bath");
        myAccount.setAccountName("Ollie's Account");
        myAccount.setYearOfStudy(3);
        myAccount.depositFunds(5000);
        myAccount.changeName("Oliver");
        System.out.println(myAccount.getAccountName());
        System.out.println("Balance is " + myAccount.getBalance());


        timsAccount.depositFunds(500);
        System.out.println("Balance is " + timsAccount.getBalance());

        timsAccount.withdrawFunds(200);
        System.out.println("Balance is " + timsAccount.getBalance());

    }
}
