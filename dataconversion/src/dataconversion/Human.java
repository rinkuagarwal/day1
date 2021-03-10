package dataconversion;

public class Human {
	 private String name;//data encapsulation
	 private byte age;//in year
	 void eat()
	 {
		 System.out.println("humAN eats");
	 }	
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
		public GENDER getGender() {
			return gender;
		}
		public void setGender(GENDER gender) {
			this.gender = gender;
		}

		 private GENDER gender=GENDER.FEMALE;
		 
}
