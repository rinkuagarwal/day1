
public class Teacher extends Human{
	private String name;
	private byte age;
	Teacher(){
		   
	   }
	 void teach() {
		   System.out.println(getName()+" is teaching");
	   }
	  public Teacher(String name){
		  setName(name);
	   }

	 

	
}
