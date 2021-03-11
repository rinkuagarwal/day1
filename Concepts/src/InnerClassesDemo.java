
public class InnerClassesDemo {
	public static void main(String[] args) {
		Account[] accounts=new Account[10];
		}
	}


class Account{
   //private Address address;
	private Address[] addresses;//multiple addresses can be handled, it a reference only object not created
	private int number;
	public Account() {
		this.addresses =new Address[3];//object created here, it called lazy initialization
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] addresses) {
		this.addresses = addresses;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	class Address{
		private String StreetNmae;

		public String getStreetNmae() {
			return StreetNmae;
		}

		public void setStreetNmae(String streetNmae) {
			StreetNmae = streetNmae;
		}
	}
}
