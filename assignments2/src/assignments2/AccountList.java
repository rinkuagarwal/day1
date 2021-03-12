package assignments2;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
	public static void main(String[] args) {
		Account[] accounts=new Account[2];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i]=new Account("account"+i,500.0f*i);
			System.out.println(accounts[i]);
			
		}
		List<Account> accountList=new ArrayList<Account>();
		for (int i =0; i < accounts.length; i++) {
			accountList.add(accounts[i]);
		}
		System.out.println(accountList);
	}

}
