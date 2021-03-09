
public class Human {
	 private String name;//data encapsulation
	 private byte age;//in year
	 public String getName() {
		   return name;
	   }
	 public void setName(String name) {
		   if(name == null | name.trim().equals("")) {
			   throw new IllegalArgumentException("name is mandatory"); 
		   }
		   this.name = name;
	   }
	 public byte getAge() {
			return age;
		}

		public void setAge(byte age) {
			this.age = age;
		}

}
