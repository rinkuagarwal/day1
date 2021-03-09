
public class Student extends Human{
   
   
   void study() {
	   System.out.println(getName()+" is studing");
   }
   
Student(){//default constructor
	   
   }
   
   Student(String name){//custom constructor
	  setName(name);
   }
   
   
  
   
}
