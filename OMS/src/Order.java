public class Order{ 
	
	private ITEM item;
	private ADDRESS address;
	private String name;
	private STATUS status;
    public STATUS getStatus() {
		return status;
	}
public void setStatus(STATUS status) {
		this.status = status;
	}

public Order(String name) {
		this.setName(name);
	}
public ADDRESS getAddress() {
		return address;
	}

	public void setAddress(ADDRESS address) {
		this.address = address;
	}

	public ITEM getItem() {
		return item;
	}

	public void setItem(ITEM item) {
		this.item = item;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
}
enum ITEM{
	A , B
}
enum ADDRESS{
	CHURCHROAD,CITYTOWER
}
enum STATUS{
	PENDING,COMPLETED
}
