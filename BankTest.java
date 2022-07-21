public class BankTest {
	public static void main(String[] args) {

        //Create accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        //Account 1 : Deposit into the checking balance and savings balance
        acc1.DepositCheck(4500);
        acc1.DepositCheck(500);
        acc1.DepositSav(1500);
        acc1.DepositSav(200);

        //Account 1 : Withdraw from checking balance and savings balance
        acc1.WithdrawCheck(350);
        acc1.WithdrawSav(50);
        acc1.WithdrawCheck(200);
        acc1.WithdrawSav(70);

        //Account 1 : Check total amount of the account
        acc1.Total();

        //Account 2 : Deposit into the checking balance and savings balance
        acc2.DepositCheck(500);
        acc2.DepositCheck(300);
        acc2.DepositSav(250);
        acc2.DepositSav(50);

        //Account 2 : Withdraw from checking balance and savings balance
        acc2.WithdrawCheck(450);
        acc2.WithdrawSav(50);
        acc2.WithdrawCheck(300);
        acc2.WithdrawSav(70);

        //Account 2 : Check total amount of the account
        acc2.Total();

	}
}
