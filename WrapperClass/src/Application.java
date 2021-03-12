import java.util.ArrayList;
import java.util.List;

public class Application {
public static void main(String[] args) {
	int a=1;
	Integer b=a;//autoboxing
	Double d=23.09;
	double primitiveDouble=d;//auto unboxing
	System.out.println(d.compareTo(5.5));
	List<Integer> numbers=new ArrayList<Integer>();
	numbers.add(44);//automatically get conveted ti integer object
	
}
}
