import java.util.logging.Logger;

public class StaticHKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s2.setCount(1);
		s1.setCount(11);//last value will be printed
		System.out.println(s1.getCount());
		System.out.println(s2.getCount());
		Student.study();//class is used to access the static methods
		s1.study();//avoid
	}

}
class Student{
	static Logger Logger = java.util.logging.Logger.getLogger(Student.class.toString());
	private static int count;

	public int getCount() {
		Logger.warning("warning");
		Logger.severe("sereve");
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public static void study() {
		System.out.println("study..");
	}
}
