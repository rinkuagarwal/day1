public class School {
	public static void main(String[] args) {
		System.out.println("Hello");
		Student student =new Student("Ram chand");
		student.setAge((byte)10);
		//Teacher teacher =new Teacher("Sunil");
		//teacher.setAge((byte)22);
		for(int i=0;i<=10;i++) {
			Teacher teacher =new Teacher("Sunil"+i);
		}
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		//student.setName("");/avoid
		//student.name="Ram";/avoid
		System.out.println("Name="+student.getName());
		System.out.println("Age="+student.getAge());
		student.study();//ram is studying
		System.out.println("Name="+teacher.getName());
		System.out.println("Age="+teacher.getAge());
	    teacher.teach();
	}
}