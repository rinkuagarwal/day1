
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child=new Child();
		child.m1();
		child.m2();
	}

}
class Parent{//final class Parent
	final String Name="Rinky";
	final void  m1(){
		System.out.println("parent");
	}
	
	void m2() {
		
	}
}
class Child extends Parent{//not accessible here as final class cannot be inhert if we declared final class Parent
	 void m1() {//override
		System.out.println("child");
	}
	 @Override
	 void m2() {
			
		}
}
