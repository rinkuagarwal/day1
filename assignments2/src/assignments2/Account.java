package assignments2;

public class Account {

	private String name;
	private Float balance;
	public Account(String name, Float balance) {
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return"{ Name="+this.name+",Balance  "+this.balance+"}";
	}
	
}
