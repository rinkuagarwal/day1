
public class OMS {
	public static void main(String[] args) {
		Customer customer=new Customer("Ram chand");
		System.out.println("Name="+customer.getName());
		Order order1 =new Order("121");
		System.out.println("Order No.="+order1.getName());
	    order1.setItem(ITEM.A);
	    order1.setAddress(ADDRESS.CHURCHROAD);
	    System.out.println("ITEM="+order1.getItem());
	    System.out.println("ADDRESS="+order1.getAddress());
	    order1.setStatus(STATUS.PENDING);
	    System.out.println(order1.getStatus());
	    
	    
	    Customer customer1=new Customer("Ram");
		System.out.println("Name="+customer1.getName());
	    Order order2 =new Order("122");
	    System.out.println("Order No.="+order2.getName());
	    order2.setItem(ITEM.A);
	    order2.setAddress(ADDRESS.CHURCHROAD);
	    System.out.println("ITEM="+order2.getItem());
	    System.out.println("ADDRESS="+order2.getAddress());
	    order2.setStatus(STATUS.COMPLETED);
	    System.out.println(order2.getStatus());
	    
	    
	     
	    Customer customer2=new Customer("Sunil");
		System.out.println("Name="+customer2.getName());
	    Order order3 =new Order("123");
	    System.out.println("Order NO.="+order3.getName());
	    order3.setItem(ITEM.A);
	    order3.setAddress(ADDRESS.CHURCHROAD);
	    System.out.println("ITEM="+order3.getItem());
	    System.out.println("ADDRESS="+order3.getAddress());
	    order3.setStatus(STATUS.PENDING);
	    System.out.println(order3.getStatus());
	    
	   
	
	 
	}

}
