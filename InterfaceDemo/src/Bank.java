
public class Bank {
	public static void main(String[] args) {
		IAccount[] savingsAccount = new IAccount[3];
		savingsAccount[0]=new SavingAccount();
		savingsAccount[1]=new FDAccount();
		savingsAccount[2]=new RecurringAccount();
		for (IAccount iAccount : savingsAccount) {
			iAccount.deposit();
		}
		
	}

}
