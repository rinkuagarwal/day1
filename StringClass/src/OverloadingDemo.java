
public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.study();
		s1.study(1);
		s1.study(1,"cc");
	}

}
//same method, different number and type of argumeny
class Student1{
	public void study(int duration, String subject) {
		System.out.println("study..for"+duration+"hour"+subject);
		//study(duration); if i make the method private then need to call it inside a normal method n can be used bt method call remain the same
	}
	//private void study(int duration) {
		//System.out.println("study..for"+duration+"hour");
	public void study(int duration) {
		System.out.println("study..for"+duration+"hour");
	}
	public void study() {
		System.out.println("study..for");
	}
}
