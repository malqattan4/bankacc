public class BankTest {
	public static void main(String[] args) {

        //Create accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        //Account 1 : Deposit into the checking balance and savings balance
        acc1.Deposit(1, 4500);
        acc1.Deposit(1, 500);
        acc1.Deposit(2, 1500);
        acc1.Deposit(2, 200);

        //Account 1 : Withdraw from checking balance and savings balance
        acc1.Withdraw(3, 350);
        acc1.Withdraw(3, 50);
        acc1.Withdraw(4, 200);
        acc1.Withdraw(4, 70);

        //Account 1 : Check total amount of the account
        acc1.Total();

        //Account 2 : Deposit into the checking balance and savings balance
        acc2.Deposit(1, 500);
        acc2.Deposit(1, 300);
        acc2.Deposit(2, 250);
        acc2.Deposit(2, 50);

        //Account 2 : Withdraw from checking balance and savings balance
        acc2.Withdraw(3, 450);
        acc2.Withdraw(3, 50);
        acc2.Withdraw(4, 300);
        acc2.Withdraw(4, 70);

        //Account 2 : Check total amount of the account
        acc2.Total();

	}
}
